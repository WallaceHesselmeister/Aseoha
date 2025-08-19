/* (C) TAMA Studios 2025 */
package tama.data;

import com.code.tama.tts.server.misc.ARSStructure;
import com.code.tama.tts.server.registries.ARSRegistry;
import lombok.Getter;

import java.util.List;

public class DataQuantiscopeList {
    @Getter
    private static List<ARSStructure> StructureList;

    public static void setList(List<ARSStructure> list) {
        StructureList = list;
        ARSRegistry.STRUCTURES.clear();
        ARSRegistry.STRUCTURES.addAll(list);
    }
}
