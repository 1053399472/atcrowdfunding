package crowd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.security.auth.Subject;
import java.util.List;
import java.util.Map;
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Student {
    private String name;
    private Integer id;
    private Address address;
    private List<Subject> subjects;
    private Map<String,String> map;
}
