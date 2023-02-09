import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Bean1 {


    @Bean(name= "emp")
    public Employee getEmp(){
        Employee emp = new Employee(1001,"Max", 100);
        return emp;

    }

}
