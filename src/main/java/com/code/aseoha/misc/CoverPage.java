package com.code.aseoha.misc;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class CoverPage extends Page {

    private ResourceLocation texture;
    private String title;

    @Override
    public void render(MatrixStack stack, FontRenderer font, int globalPage, int x, int y, int width, int height) {

        //Draw title

        int i = 0;
        for(String title : this.getLines()){
            int titleSpace = WIDTH / 4;

            font.draw(stack, title, x + titleSpace, y + ((font.lineHeight + 2) * i) - 5, 0x00000);

            ++i;
        }

        //Draw icon
       if(this.texture != null){
           RenderSystem.enableBlend();
           Minecraft.getInstance().getTextureManager().bind(this.texture);
           BufferBuilder bb = Tessellator.getInstance().getBuilder();

           int w = WIDTH, h = WIDTH;

           x += (int)Math.floor(w / 2.0) - 10;
           y = y + h / 2;

           bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

           bb.vertex(x, y, 0).uv(0, 0).endVertex();
           bb.vertex(x, y + h, 0).uv(0, 1).endVertex();
           bb.vertex(x + w, y + h, 0).uv(1, 1).endVertex();
           bb.vertex(x + w, y, 0).uv(1, 0).endVertex();


           Tessellator.getInstance().end();

           RenderSystem.disableBlend();
       }

    }

    public void setIcon(ResourceLocation loc){
        this.texture = new ResourceLocation(loc.getNamespace(), "textures/manual/" + loc.getPath() + ".png");
    }

    public void setTitle(String title) {
        this.title = title;
        this.parseString(title);
    }
    
    public String getTitle() {
    	return this.title;
    }
}
