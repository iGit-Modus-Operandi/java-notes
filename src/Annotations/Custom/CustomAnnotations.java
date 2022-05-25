package Annotations.Custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE) // valid on classes
// @Target(ElementType.METHOD) // valid on methods
@Retention(RetentionPolicy.RUNTIME)

public @interface CustomAnnotations { // replace class with @interface to make this a custom annotation
  // insert fields here to add parameter when you use your annotation
}
