package rest.demo.practice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String address;
    private long marks;
}
