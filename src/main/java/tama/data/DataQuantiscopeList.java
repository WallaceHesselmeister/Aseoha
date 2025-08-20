/* (C) TAMA Studios 2025 */
package tama.data;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class DataQuantiscopeList {
    @Getter
    private static final List<DataQuantiscopeRecipe> StructureList = new ArrayList<>();

    public static void setList(List<DataQuantiscopeRecipe> list) {
        StructureList.clear();
        StructureList.addAll(list);
    }
}
