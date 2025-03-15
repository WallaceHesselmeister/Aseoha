//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.misc;

import com.code.aseoha.aseoha;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.ChangePageButton;
import net.minecraft.item.ItemStack;
import net.minecraft.resources.IResource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.tardis.mod.Tardis;
import net.tardis.mod.client.guis.widgets.ChangeChapterButton;
import net.tardis.mod.client.guis.widgets.ReturnToIndexButton;
import net.tardis.mod.contexts.gui.GuiItemContext;
import net.tardis.mod.misc.GuiContext;
import org.jetbrains.annotations.NotNull;

public class ManualScreen extends Screen {
    public static final ResourceLocation TEXTURE = new ResourceLocation(aseoha.MODID, "textures/gui/manual.png");
    private List<Chapter> chapters;
    private int pageIndex;
    private int chapterIndex;
    private String modid;
    private static final TranslationTextComponent NEXT_PAGE = new TranslationTextComponent("tooltip.tardis.manual.next_page");
    private static final TranslationTextComponent PREV_PAGE = new TranslationTextComponent("tooltip.tardis.manual.previous_page");
    private static final TranslationTextComponent NEXT_CHAPTER = new TranslationTextComponent("tooltip.tardis.manual.next_chapter");
    private static final TranslationTextComponent PREV_CHAPTER = new TranslationTextComponent("tooltip.tardis.manual.previous_chapter");
    private static final TranslationTextComponent LAST_PAGE = new TranslationTextComponent("tooltip.tardis.manual.last_page");
    private static final TranslationTextComponent FIRST_PAGE = new TranslationTextComponent("tooltip.tardis.manual.first_page");
    private ChangePageButton pageForward;
    private ChangePageButton pageBack;
    private ChangeChapterButton chapterForward;
    private ChangeChapterButton chapterBack;
    private ReturnToIndexButton endOfManual;
    private ReturnToIndexButton startOfManual;
    public int pageX;
    public int pageY;
    public int page2X;

    protected ManualScreen(ITextComponent titleIn, String modid) {
        super(titleIn);
        this.chapters = Lists.newArrayList();
        this.pageIndex = 0;
        this.chapterIndex = 0;
        this.pageX = this.width / 2 - 110;
        this.pageY = this.height / 2 - 70;
        this.page2X = this.pageX + 120;
        this.modid = modid;
        this.read();
        this.insertTOC();
    }

    public ManualScreen(GuiContext context) {
        this(new StringTextComponent("Manual"), "aseoha");
        if (context instanceof GuiItemContext) {
            ItemStack stack = ((GuiItemContext)context).getItemStack();
            if (stack.hasTag()) {
                if (stack.getTag().contains("page")) {
                    this.pageIndex = stack.getTag().getInt("page");
                }

                if (stack.getTag().contains("chapter")) {
                    this.chapterIndex = stack.getTag().getInt("chapter");
                }
            }
        }

    }

    public void onClose() {
//        Network.sendToServer(new UpdateManualPageMessage(this.pageIndex, this.chapterIndex));
        super.onClose();
    }

    protected void init() {
        super.init();
        this.read();
        this.buttons.clear();
        this.addButton(this.pageForward = new ChangePageButton(this.width / 2 + 95, this.height / 2 + 70, true, (button) -> {
            this.turnPage(true);
        }, true));
        this.addButton(this.pageBack = new ChangePageButton(this.width / 2 - 120, this.height / 2 + 70, false, (button) -> {
            this.turnPage(false);
        }, true));
        this.addButton(this.chapterForward = new ChangeChapterButton(this.width / 2 + 25, this.height / 2 + 70, true, (button) -> {
            this.turnChapter(true);
        }, true));
        this.addButton(this.chapterBack = new ChangeChapterButton(this.width / 2 - 45, this.height / 2 + 70, false, (button) -> {
            this.turnChapter(false);
        }, true));
        this.updatePageWidths();
        this.insertTOC();
        this.addButton(this.endOfManual = new ReturnToIndexButton(this.width / 2 + 125, this.height / 2 - 85, true, (button) -> {
            this.turnToTableOfContents(true);
        }, true));
        this.addButton(this.startOfManual = new ReturnToIndexButton(this.width / 2 - 140, this.height / 2 - 85, false, (button) -> {
            this.turnToTableOfContents(false);
        }, true));
    }

    public void openPage(int chapterIndex, int pageIndex) {
        this.chapterIndex = chapterIndex;
        this.pageIndex = pageIndex;
    }

    public void updatePageWidths() {
        this.pageX = this.width / 2 - 110;
        this.pageY = this.height / 2 - 70;
        this.page2X = this.pageX + 120;
    }

    @SuppressWarnings("unchecked")
    public void render(@NotNull MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        Minecraft.getInstance().getTextureManager().bind(this.getTexture());
        this.blit(matrixStack, (this.width - 256) / 2, (this.height - 187) / 2, 0, 0, 256, 187);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        Pair<Page, Page> pages = this.getPages();
        if (pages.getFirst() != null) {
            ((Page)pages.getFirst()).render(matrixStack, this.font, this.getGlobalPageNumber(), this.pageX, this.pageY, this.width, this.height);
        }

        if (pages.getSecond() != null) {
            ((Page)pages.getSecond()).render(matrixStack, this.font, this.getGlobalPageNumber() + 1, this.page2X, this.pageY, this.width, this.height);
        }

        this.renderTooltips(matrixStack, mouseX, mouseY, partialTicks);
    }

    private void renderTooltips(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        if (this.pageForward.isHovered()) {
            this.renderTooltip(matrixStack, NEXT_PAGE, mouseX, mouseY);
        }

        if (this.pageBack.isHovered()) {
            this.renderTooltip(matrixStack, PREV_PAGE, mouseX, mouseY);
        }

        if (this.chapterForward.isHovered()) {
            this.renderTooltip(matrixStack, NEXT_CHAPTER, mouseX, mouseY);
        }

        if (this.chapterBack.isHovered()) {
            this.renderTooltip(matrixStack, PREV_CHAPTER, mouseX, mouseY);
        }

        if (this.endOfManual.isHovered()) {
            this.renderTooltip(matrixStack, LAST_PAGE, mouseX, mouseY);
        }

        if (this.startOfManual.isHovered()) {
            this.renderTooltip(matrixStack, FIRST_PAGE, mouseX, mouseY);
        }

    }

    @SuppressWarnings("unchecked")
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        Pair<Page, Page> pages = this.getPages();
        if (mouseY > (double)this.pageY && mouseY < (double)(this.pageY + 144)) {
            Page page;
            if (mouseX > (double)this.pageX && mouseX < (double)(this.pageX + 115)) {
                page = (Page)pages.getFirst();
                if (page != null) {
                    page.onClick(mouseX - (double)this.pageX, mouseY - (double)this.pageY);
                }
            } else if (mouseX > (double)this.page2X && mouseX < (double)(this.page2X + 115)) {
                page = (Page)pages.getSecond();
                if (page != null) {
                    page.onClick(mouseX - (double)this.pageX, mouseY - (double)this.pageY);
                }
            }
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    public void turnPage(boolean forward) {
        Chapter currentChapter = this.getChapter();
        if (currentChapter == null) {
            this.chapterIndex = 0;
        } else {
            if (forward) {
                if (this.pageIndex + 2 < currentChapter.getPages().size()) {
                    this.pageIndex += 2;
                } else if (this.chapterIndex + 1 < this.chapters.size()) {
                    ++this.chapterIndex;
                    this.pageIndex = 0;
                }
            } else if (this.pageIndex - 2 >= 0) {
                this.pageIndex -= 2;
            } else if (this.chapterIndex - 1 >= 0) {
                --this.chapterIndex;
                int chapterSize = this.getChapter().getPages().size();
                this.pageIndex = chapterSize % 2 == 0 ? chapterSize - 2 : chapterSize - 1;
            }

        }
    }

    public void insertTOC() {
        Chapter chapter = (Chapter)this.chapters.get(0);
        if (chapter != null) {
            int maxPerPage = 13;
            int maxChapters = this.chapters.size();
            if (maxChapters > 0) {
                int initialPages = (int)((double)maxChapters / (double)maxPerPage);
                int numPages = (int)((double)maxChapters % (double)maxPerPage) == 0 ? initialPages : initialPages + 1;
                if (numPages > 0) {
                    int prevEndIndex = 0;

                    for(int i = 0; i < numPages; ++i) {
                        int startIndex = i * maxPerPage;
                        int endIndex = startIndex + maxPerPage > maxChapters ? maxChapters - 1 : startIndex + maxPerPage;
                        if (startIndex == prevEndIndex && prevEndIndex > 0) {
                            startIndex = endIndex;
                        }

                        prevEndIndex = endIndex;
                        if (!(chapter.getPages().get(i) instanceof TOCPage)) {
                            chapter.insertPage(i, new TOCPage(this, startIndex, endIndex));
                        }
                    }
                }
            }
        }

    }

    public void turnChapter(boolean forward) {
        Chapter currentChapter = this.getChapter();
        if (currentChapter == null) {
            this.chapterIndex = 0;
        } else {
            if (forward) {
                if (this.chapterIndex + 1 < this.chapters.size()) {
                    ++this.chapterIndex;
                    this.pageIndex = 0;
                }
            } else if (this.chapterIndex - 1 >= 0) {
                --this.chapterIndex;
                this.pageIndex = 0;
            }

        }
    }

    public void turnToChapter(int chapterIndex) {
        if (chapterIndex < this.chapters.size()) {
            this.chapterIndex = chapterIndex;
            this.pageIndex = 0;
        }

    }

    public void turnToTableOfContents(boolean forward) {
        if (forward) {
            int maxChapter = this.chapters.size() - 1;
            this.chapterIndex = maxChapter;
            this.pageIndex = ((Chapter)this.chapters.get(maxChapter)).getPages().size() - 1;
        } else {
            this.chapterIndex = 0;
            this.pageIndex = 0;
        }

    }

    public int getGlobalPageNumber() {
        int pages = 0;

        for(int i = 0; i < this.chapterIndex; ++i) {
            pages += ((Chapter)this.chapters.get(i)).getPages().size();
        }

        return pages + this.pageIndex;
    }

    public Chapter getChapter() {
        return this.chapterIndex < this.chapters.size() ? (Chapter)this.chapters.get(this.chapterIndex) : null;
    }

    public List<Chapter> getChapters() {
        return this.chapters;
    }

    public int getChapterIndex() {
        return this.chapterIndex;
    }

    @SuppressWarnings("unchecked")
    public Pair getPages() {
        Chapter chapter = this.getChapter();
        if (chapter != null && this.pageIndex < chapter.getPages().size()) {
            Page page2 = null;
            if (this.pageIndex + 1 < chapter.getPages().size()) {
                page2 = (Page)chapter.getPages().get(this.pageIndex + 1);
            }

            return new Pair(this.getChapter().getPages().get(this.pageIndex), page2);
        } else {
            return new Pair(null, null);
        }
    }

    public ResourceLocation getTexture() {
        return TEXTURE;
    }

    @NotNull
    public <T extends Widget> T addButton(@NotNull T button) {
        return super.addButton(button);
    }

    private void read() {
        String localeCode = Minecraft.getInstance().getLanguageManager().getSelected().getCode();
        ResourceLocation indexLocation = this.getManualIndexResourceLocation(localeCode);
        IResource resource = null;

        try {
            resource = getManualResourceNullable(indexLocation);
        } catch (IOException var7) {
            IOException e = var7;
            e.printStackTrace();
            Tardis.LOGGER.error("Could not find Manual resources for locale: {}, reverting to contents for locale {}", Minecraft.getInstance().getLanguageManager().getSelected().getCode(), "en_us");
            localeCode = "en_us";
            indexLocation = this.getManualIndexResourceLocation(localeCode);

            try {
                resource = getManualResourceNullable(indexLocation);
            } catch (IOException var6) {
                IOException exTwo = var6;
                exTwo.printStackTrace();
            }
        }

        if (resource != null) {
            JsonObject root = (new JsonParser()).parse(new InputStreamReader(resource.getInputStream())).getAsJsonObject();
            Index index = Index.read(indexLocation, root, localeCode);
            this.chapters.clear();
            this.chapters.addAll(index.getChapters());
        }

    }

    public ResourceLocation getManualIndexResourceLocation(String localeCode) {
        return Index.getIndexResourceLocation(new ResourceLocation(this.modid, "main"), localeCode);
    }

    private static IResource getManualResourceNullable(ResourceLocation rl) throws IOException {
        return Minecraft.getInstance().getResourceManager().getResource(rl);
    }
}
