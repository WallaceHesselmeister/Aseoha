/* (C) TAMA Studios 2025 */
package tama.data;

import lombok.Getter;

import java.util.List;

public class DataQuantiscopeList {
    @Getter
    private static List<DataQuantiscopeRecipe> StructureList;

    public static void setList(List<DataQuantiscopeRecipe> list) {
        StructureList.clear();
        StructureList.addAll(list);
    }
}
