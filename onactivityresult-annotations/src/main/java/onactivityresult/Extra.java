package onactivityresult;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * parameters of a {@link OnActivityResult} annotated method can be annotated to get an extra of the Intent<br>
 * The type of the variable will be automatically derived.<br>
 * <br>
 * Supported types are: <br>
 * <ul>
 * <li>boolean</li>
 * <li>byte</li>
 * <li>char</li>
 * <li>double</li>
 * <li>float</li>
 * <li>int</li>
 * <li>long</li>
 * <li>short</li>
 * <li>String</li>
 * </ul>
 * Example:<br>
 * <p>
 * <code>
 *     &#64;OnActivityResult(requestCode = 1)
 *     void onResult(&#64;Extra final String extra) {
 *          // Do something
 *     }
 * </code>
 * </p>
 * <br>
 * extra name: same as parameter <br>
 * NOTE: In this case it would be extra<br>
 * <br>
 * Since the type will be derived it's not possible to set a default value via the annotation. In case the Intent does not contain the extra, type default values will be provided automatically.<br>
 * If you want set a deafult value use one of those annotations: {@link ExtraBoolean}, {@link ExtraByte}, {@link ExtraChar}, {@link ExtraDouble}, {@link ExtraFloat}, {@link ExtraInt}, {@link ExtraLong} and {@link ExtraShort}
 *
 * @since 0.3.0
 */
@Retention(CLASS)
@Target(PARAMETER)
public @interface Extra {}