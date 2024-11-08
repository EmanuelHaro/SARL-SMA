import io.sarl.api.core.AgentKilled;
import io.sarl.api.core.AgentSpawned;
import io.sarl.api.core.ContextJoined;
import io.sarl.api.core.ContextLeft;
import io.sarl.api.core.Destroy;
import io.sarl.api.core.Initialize;
import io.sarl.api.core.Logging;
import io.sarl.api.core.MemberJoined;
import io.sarl.api.core.MemberLeft;
import io.sarl.api.core.ParticipantJoined;
import io.sarl.api.core.ParticipantLeft;
import io.sarl.api.core.SpaceCreated;
import io.sarl.api.core.SpaceDestroyed;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.AtomicSkillReference;
import io.sarl.lang.core.DynamicSkillProvider;
import io.sarl.lang.core.Event;
import io.sarl.lang.core.annotation.ImportedCapacityFeature;
import io.sarl.lang.core.annotation.PerceptGuardEvaluator;
import io.sarl.lang.core.annotation.SarlElementType;
import io.sarl.lang.core.annotation.SarlSpecification;
import io.sarl.lang.core.annotation.SyntheticMember;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.13")
@SarlElementType(19)
@SuppressWarnings("all")
public class Fire_Agent extends Agent {
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
    _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER.info("The agent was started.");
  }

  private void $behaviorUnit$Destroy$1(final Destroy occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
    _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER.info("The agent was stopped.");
  }

  private void $behaviorUnit$AgentSpawned$2(final AgentSpawned occurrence) {
  }

  private void $behaviorUnit$AgentKilled$3(final AgentKilled occurrence) {
  }

  private void $behaviorUnit$ContextJoined$4(final ContextJoined occurrence) {
  }

  private void $behaviorUnit$ContextLeft$5(final ContextLeft occurrence) {
  }

  private void $behaviorUnit$MemberJoined$6(final MemberJoined occurrence) {
  }

  private void $behaviorUnit$MemberLeft$7(final MemberLeft occurrence) {
  }

  private void $behaviorUnit$MemberLeft$8(final MemberLeft occurrence) {
  }

  private void $behaviorUnit$SpaceCreated$9(final SpaceCreated occurrence) {
  }

  private void $behaviorUnit$SpaceDestroyed$10(final SpaceDestroyed occurrence) {
  }

  private void $behaviorUnit$ParticipantJoined$11(final ParticipantJoined occurrence) {
  }

  private void $behaviorUnit$ParticipantLeft$12(final ParticipantLeft occurrence) {
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
  private void $guardEvaluator$Initialize(final Initialize occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$0(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$AgentSpawned(final AgentSpawned occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$AgentSpawned$2(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Destroy(final Destroy occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Destroy$1(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$MemberLeft(final MemberLeft occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$MemberLeft$7(occurrence));
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$MemberLeft$8(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$SpaceDestroyed(final SpaceDestroyed occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$SpaceDestroyed$10(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ParticipantLeft(final ParticipantLeft occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ParticipantLeft$12(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$AgentKilled(final AgentKilled occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$AgentKilled$3(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$SpaceCreated(final SpaceCreated occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$SpaceCreated$9(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ContextLeft(final ContextLeft occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ContextLeft$5(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ParticipantJoined(final ParticipantJoined occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ParticipantJoined$11(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$MemberJoined(final MemberJoined occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$MemberJoined$6(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ContextJoined(final ContextJoined occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ContextJoined$4(occurrence));
  }

  @SyntheticMember
  @Override
  public void $getSupportedEvents(final Set<Class<? extends Event>> toBeFilled) {
    super.$getSupportedEvents(toBeFilled);
    toBeFilled.add(AgentKilled.class);
    toBeFilled.add(AgentSpawned.class);
    toBeFilled.add(ContextJoined.class);
    toBeFilled.add(ContextLeft.class);
    toBeFilled.add(Destroy.class);
    toBeFilled.add(Initialize.class);
    toBeFilled.add(MemberJoined.class);
    toBeFilled.add(MemberLeft.class);
    toBeFilled.add(ParticipantJoined.class);
    toBeFilled.add(ParticipantLeft.class);
    toBeFilled.add(SpaceCreated.class);
    toBeFilled.add(SpaceDestroyed.class);
  }

  @SyntheticMember
  @Override
  public boolean $isSupportedEvent(final Class<? extends Event> event) {
    if (AgentKilled.class.isAssignableFrom(event)) {
      return true;
    }
    if (AgentSpawned.class.isAssignableFrom(event)) {
      return true;
    }
    if (ContextJoined.class.isAssignableFrom(event)) {
      return true;
    }
    if (ContextLeft.class.isAssignableFrom(event)) {
      return true;
    }
    if (Destroy.class.isAssignableFrom(event)) {
      return true;
    }
    if (Initialize.class.isAssignableFrom(event)) {
      return true;
    }
    if (MemberJoined.class.isAssignableFrom(event)) {
      return true;
    }
    if (MemberLeft.class.isAssignableFrom(event)) {
      return true;
    }
    if (ParticipantJoined.class.isAssignableFrom(event)) {
      return true;
    }
    if (ParticipantLeft.class.isAssignableFrom(event)) {
      return true;
    }
    if (SpaceCreated.class.isAssignableFrom(event)) {
      return true;
    }
    if (SpaceDestroyed.class.isAssignableFrom(event)) {
      return true;
    }
    return false;
  }

  @SyntheticMember
  @Override
  public void $evaluateBehaviorGuards(final Object event, final Collection<Runnable> callbacks) {
    super.$evaluateBehaviorGuards(event, callbacks);
    if (event instanceof AgentKilled) {
      final AgentKilled occurrence = (AgentKilled) event;
      $guardEvaluator$AgentKilled(occurrence, callbacks);
    }
    if (event instanceof AgentSpawned) {
      final AgentSpawned occurrence = (AgentSpawned) event;
      $guardEvaluator$AgentSpawned(occurrence, callbacks);
    }
    if (event instanceof ContextJoined) {
      final ContextJoined occurrence = (ContextJoined) event;
      $guardEvaluator$ContextJoined(occurrence, callbacks);
    }
    if (event instanceof ContextLeft) {
      final ContextLeft occurrence = (ContextLeft) event;
      $guardEvaluator$ContextLeft(occurrence, callbacks);
    }
    if (event instanceof Destroy) {
      final Destroy occurrence = (Destroy) event;
      $guardEvaluator$Destroy(occurrence, callbacks);
    }
    if (event instanceof Initialize) {
      final Initialize occurrence = (Initialize) event;
      $guardEvaluator$Initialize(occurrence, callbacks);
    }
    if (event instanceof MemberJoined) {
      final MemberJoined occurrence = (MemberJoined) event;
      $guardEvaluator$MemberJoined(occurrence, callbacks);
    }
    if (event instanceof MemberLeft) {
      final MemberLeft occurrence = (MemberLeft) event;
      $guardEvaluator$MemberLeft(occurrence, callbacks);
    }
    if (event instanceof ParticipantJoined) {
      final ParticipantJoined occurrence = (ParticipantJoined) event;
      $guardEvaluator$ParticipantJoined(occurrence, callbacks);
    }
    if (event instanceof ParticipantLeft) {
      final ParticipantLeft occurrence = (ParticipantLeft) event;
      $guardEvaluator$ParticipantLeft(occurrence, callbacks);
    }
    if (event instanceof SpaceCreated) {
      final SpaceCreated occurrence = (SpaceCreated) event;
      $guardEvaluator$SpaceCreated(occurrence, callbacks);
    }
    if (event instanceof SpaceDestroyed) {
      final SpaceDestroyed occurrence = (SpaceDestroyed) event;
      $guardEvaluator$SpaceDestroyed(occurrence, callbacks);
    }
  }

  @SyntheticMember
  public Fire_Agent(final UUID parentID, final UUID agentID) {
    super(parentID, agentID);
  }

  @SyntheticMember
  @Inject
  public Fire_Agent(final UUID parentID, final UUID agentID, final DynamicSkillProvider skillProvider) {
    super(parentID, agentID, skillProvider);
  }
}
