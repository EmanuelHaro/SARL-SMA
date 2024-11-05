import io.sarl.api.core.Logging;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.AtomicSkillReference;
import io.sarl.lang.core.Behavior;
import io.sarl.lang.core.Event;
import io.sarl.lang.core.annotation.ImportedCapacityFeature;
import io.sarl.lang.core.annotation.PerceptGuardEvaluator;
import io.sarl.lang.core.annotation.SarlElementType;
import io.sarl.lang.core.annotation.SarlSpecification;
import io.sarl.lang.core.annotation.SyntheticMember;
import java.util.Collection;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.13")
@SarlElementType(21)
@SuppressWarnings("all")
public class Comportamiento extends Behavior {
  private void $behaviorUnit$RecibeEvento$0(final RecibeEvento occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
    _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER.info(("recibe evento: " + occurrence.value));
  }

  public void MostrarParametro(final int... param) {
    Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
    _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER.info(("params are " + param));
  }

  @Extension
  @ImportedCapacityFeature(Logging.class)
  @SyntheticMember
  private transient AtomicSkillReference $CAPACITY_USE$IO_SARL_API_CORE_LOGGING;

  @SyntheticMember
  @Pure
  private Logging $CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING.get() == null) {
      this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING = $getSkill(Logging.class);
    }
    return $castSkill(Logging.class, this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING);
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$RecibeEvento(final RecibeEvento occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$RecibeEvento$0(occurrence));
  }

  @SyntheticMember
  @Override
  public void $getSupportedEvents(final Set<Class<? extends Event>> toBeFilled) {
    super.$getSupportedEvents(toBeFilled);
    toBeFilled.add(RecibeEvento.class);
  }

  @SyntheticMember
  @Override
  public boolean $isSupportedEvent(final Class<? extends Event> event) {
    if (RecibeEvento.class.isAssignableFrom(event)) {
      return true;
    }
    return false;
  }

  @SyntheticMember
  @Override
  public void $evaluateBehaviorGuards(final Object event, final Collection<Runnable> callbacks) {
    super.$evaluateBehaviorGuards(event, callbacks);
    if (event instanceof RecibeEvento) {
      final RecibeEvento occurrence = (RecibeEvento) event;
      $guardEvaluator$RecibeEvento(occurrence, callbacks);
    }
  }

  @SyntheticMember
  public Comportamiento(final Agent agent) {
    super(agent);
  }
}
