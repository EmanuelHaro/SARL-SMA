import io.sarl.lang.core.AgentTrait;
import io.sarl.lang.core.Capacity;
import io.sarl.lang.core.annotation.SarlElementType;
import io.sarl.lang.core.annotation.SarlSpecification;

@SarlSpecification("0.13")
@SarlElementType(20)
@SuppressWarnings("all")
public interface Capacidades extends Capacity {
  void debug(final String s);

  void informacion(final String s);

  /**
   * @ExcludeFromApidoc
   */
  class ContextAwareCapacityWrapper<C extends Capacidades> extends Capacity.ContextAwareCapacityWrapper<C> implements Capacidades {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }

    public void debug(final String s) {
      try {
        ensureCallerInLocalThread();
        this.capacity.debug(s);
      } finally {
        resetCallerInLocalThread();
      }
    }

    public void informacion(final String s) {
      try {
        ensureCallerInLocalThread();
        this.capacity.informacion(s);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
