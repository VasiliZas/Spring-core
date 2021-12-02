package vasilizas.bean.db;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Data
@Setter
@NoArgsConstructor
public class Themes {

    private Integer id;
    private String themegroup;
    private Integer idgroup;
    private Group group;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Themes themes = (Themes) o;
        return Objects.equals(id, themes.id) && Objects.equals(themegroup, themes.themegroup)
                && Objects.equals(idgroup, themes.idgroup) && Objects.equals(group, themes.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, themegroup, idgroup, group);
    }

    @Override
    public String toString() {
        return themegroup;
    }
}
