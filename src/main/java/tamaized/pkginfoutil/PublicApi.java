package tamaized.pkginfoutil;

import java.lang.annotation.*;

/**
 * Can be used to suppress unused or other various warnings
 */
@PublicApi
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface PublicApi {
}
