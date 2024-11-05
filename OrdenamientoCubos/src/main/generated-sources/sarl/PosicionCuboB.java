import io.sarl.lang.core.Event;
import io.sarl.lang.core.annotation.SarlElementType;
import io.sarl.lang.core.annotation.SarlSpecification;
import io.sarl.lang.core.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.13")
@SarlElementType(15)
@SuppressWarnings("all")
public class PosicionCuboB extends Event {
  public final int posActual;

  public final int posDeseada;

  public PosicionCuboB(final int i, final int j) {
    this.posActual = i;
    this.posDeseada = j;
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
    PosicionCuboB other = (PosicionCuboB) obj;
    if (other.posActual != this.posActual)
      return false;
    if (other.posDeseada != this.posDeseada)
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
    result = prime * result + Integer.hashCode(this.posDeseada);
    return result;
  }

  /**
   * Returns a String representation of the PosicionCuboB event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("posActual", this.posActual);
    builder.add("posDeseada", this.posDeseada);
  }

  @SyntheticMember
  private static final long serialVersionUID = -573547910L;
}
