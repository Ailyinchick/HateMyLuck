import java.lang.annotation.*;
import javax.validation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyValidator.class)

public @interface CheckBrakets {
    String message() default "{}";

    Class<? extends Payload>[] payload() default {};
}