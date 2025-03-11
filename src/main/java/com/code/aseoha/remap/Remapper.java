//package dev.drtheo.aitforger.remapper.mappings;
//
//import dev.drtheo.aitforger.remapper.asm.desc.FieldDesc;
//import dev.drtheo.aitforger.remapper.asm.desc.MethodDesc;
//import dev.drtheo.aitforger.remapper.api.MappingProvider;
//import net.fabricmc.mappingio.MappedElementKind;
//import net.fabricmc.mappingio.MappingVisitor;
//import net.fabricmc.mappingio.adapter.ForwardingMappingVisitor;
//import net.fabricmc.mappingio.tree.MappingTree;
//import org.jetbrains.annotations.Nullable;
//
//import java.io.IOException;
//import java.util.List;
//
//// official.accept(Intr2Mcp <- intermediary, mcp)
//public class Intr2McpMappingAdapter extends ForwardingMappingVisitor implements MappingProvider {
//
//    private final MappingTree intermediary;
//    private final MappingTree mcp;
//
//    public Intr2McpMappingAdapter(MappingVisitor parent, MappingTree intermediary, MappingTree mcp) {
//        super(parent);
//
//        this.intermediary = intermediary;
//        this.mcp = mcp;
//    }
//
//    @Override
//    public void visitNamespaces(String s, List<String> list) throws IOException {
//        super.visitNamespaces("intermediary", List.of("srg"));
//    }
//
//    private MappingTree.ClassMapping interClass;
//
//    private MappingTree.ClassMapping mcpClass;
//    private MappingTree.FieldMapping mcpField;
//    private MappingTree.MethodMapping mcpMethod;
//
//    @Override
//    public boolean visitClass(String srcName) throws IOException {
//        this.interClass = this.intermediary.getClass(srcName);
//
//        this.mcpClass = this.mcp.getClass(srcName);
//        return super.visitClass(this.getClass(srcName));
//    }
//
//    @Override
//    public boolean visitField(String srcName, @Nullable String srcDesc) throws IOException {
//        this.mcpField = this.mcpClass.getField(srcName, srcDesc);
//
//        FieldDesc desc = FieldDesc.of(srcName, srcDesc)
//                .remap(this);
//
//        return super.visitField(desc.name(), desc.desc());
//    }
//
//    @Override
//    public boolean visitMethod(String srcName, @Nullable String srcDesc) throws IOException {
//        this.mcpMethod = this.mcpClass.getMethod(srcName, srcDesc);
//
//        MethodDesc desc = MethodDesc.of(srcName, srcDesc)
//                .remap(this);
//
//        return super.visitMethod(desc.name(), desc.desc());
//    }
//
//    @Override
//    public void visitDstName(MappedElementKind targetKind, int namespace, String name) throws IOException {
//        String result = name;
//
//        if (targetKind == MappedElementKind.FIELD)
//            result = this.mcpField.getDstName(0);
//
//        if (targetKind == MappedElementKind.METHOD)
//            result = this.mcpMethod.getDstName(0);
//
//        super.visitDstName(targetKind, namespace, result != null ? result : name);
//    }
//
//    @Override
//    public String getClass(String type) {
//        MappingTree.ClassMapping mapping = this.intermediary.getClass(type);
//
//        if (mapping == null)
//            return type;
//
//        String result = mapping.getDstName(0);
//
//        if (result != null)
//            return result;
//
//        return type;
//    }
//
//    @Override
//    public String getMethod(String ownerName, String name, String desc) {
//        if (this.interClass == null)
//            return name;
//
//        MappingTree.MethodMapping mapping = this.interClass.getMethod(name, desc);
//
//        if (mapping == null)
//            return name;
//
//        String result = mapping.getDstName(0);
//
//        if (result != null)
//            return result;
//
//        return name;
//    }
//
//    @Override
//    public String getField(String ownerName, String name, String desc) {
//        if (this.interClass == null)
//            return name;
//
//        MappingTree.FieldMapping mapping = this.interClass.getField(name, desc);
//
//        if (mapping == null)
//            return name;
//
//        String result = mapping.getDstName(0);
//
//        if (result != null)
//            return result;
//
//        return name;
//    }
//}