import io.sarl.lang.core.Event;
import io.sarl.lang.core.annotation.SarlElementType;
import io.sarl.lang.core.annotation.SarlSpecification;
import io.sarl.lang.core.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.13")
@SarlElementType(15)
@SuppressWarnings("all")
public class CambiarPosicionACuboB extends Event {
  public final int posActual;

  public CambiarPosicionACuboB(final int i) {
    this.posActual = i;
  }

  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CambiarPosicionACuboB other = (CambiarPosicionACuboB) obj;
    if (other.posActual != this.posActual)
      return false;
    return super.equals(obj);
  }

  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Integer.hashCode(this.posActual);
    return result;
  }

  /**
   * Returns a String representation of the CambiarPosicionACuboB event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("posActual", this.posActual);
  }

  @SyntheticMember
  private static final long serialVersionUID = 1138298247L;
}
