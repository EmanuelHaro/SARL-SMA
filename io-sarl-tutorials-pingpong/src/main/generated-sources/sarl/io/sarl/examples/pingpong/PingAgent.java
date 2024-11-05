/**
 * $Id$
 * 
 * SARL is an general-purpose agent programming language.
 * More details on http://www.sarl.io
 * 
 * Copyright (C) 2014-2023 the original authors or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.sarl.examples.pingpong;

import com.google.common.base.Objects;
import io.sarl.api.core.AgentTask;
import io.sarl.api.core.DefaultContextInteractions;
import io.sarl.api.core.Initialize;
import io.sarl.api.core.Logging;
import io.sarl.api.core.Schedules;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.AtomicSkillReference;
import io.sarl.lang.core.DynamicSkillProvider;
import io.sarl.lang.core.Event;
import io.sarl.lang.core.Scope;
import io.sarl.lang.core.annotation.ImportedCapacityFeature;
import io.sarl.lang.core.annotation.PerceptGuardEvaluator;
import io.sarl.lang.core.annotation.SarlElementType;
import io.sarl.lang.core.annotation.SarlSpecification;
import io.sarl.lang.core.annotation.SyntheticMember;
import io.sarl.lang.core.util.SerializableProxy;
import java.io.ObjectStreamException;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author <a href="http://www.ciad-lab.fr/stephane_galland">St&eacute;phane Galland</a>
 */
@SarlSpecification("0.13")
@SarlElementType(19)
@SuppressWarnings("all")
public class PingAgent extends Agent {
  private void $behaviorUnit$Pong$0(final Pong occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
    _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER.info(("Receiving Pong #" + Integer.valueOf(occurrence.index)));
    Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER_1 = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
    _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER_1.info(("Sending Ping #" + Integer.valueOf((occurrence.index + 1))));
    Schedules _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER();
    final Procedure1<Agent> _function = (Agent it) -> {
      DefaultContextInteractions _$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER();
      Ping _ping = new Ping((occurrence.index + 1));
      class $SerializableClosureProxy implements Scope<Address> {
        
        private final Address $_source;
        
        public $SerializableClosureProxy(final Address $_source) {
          this.$_source = $_source;
        }
        
        @Override
        public boolean matches(final Address it_1) {
          return Objects.equal(it_1, $_source);
        }
      }
      final Scope<Address> _function_1 = new Scope<Address>() {
        @Override
        public boolean matches(final Address it_1) {
          Address _source = occurrence.getSource();
          return Objects.equal(it_1, _source);
        }
        private Object writeReplace() throws ObjectStreamException {
          return new SerializableProxy($SerializableClosureProxy.class, occurrence.getSource());
        }
      };
      _$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER.emit(_ping, _function_1);
    };
    _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER.in(2000, _function);
  }

  private void $behaviorUnit$Initialize$1(final Initialize occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
    _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER.info("Waiting for Pong Agent");
    Schedules _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER();
    final AgentTask taskVar = _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER.task("waiting_for_partner");
    Schedules _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER_1 = this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER();
    final Procedure1<Agent> _function = (Agent it) -> {
      DefaultContextInteractions _$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER = this.$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER();
      int _numberOfStrongParticipants = _$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER.getDefaultSpace().getNumberOfStrongParticipants();
      if ((_numberOfStrongParticipants > 1)) {
        Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER_1 = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
        _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER_1.info("Pong Agent detected.");
        Logging _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER_2 = this.$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER();
        _$CAPACITY_USE$IO_SARL_API_CORE_LOGGING$CALLER_2.info("Sending Ping #0");
        DefaultContextInteractions _$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER_1 = this.$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER();
        Ping _ping = new Ping(0);
        _$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER_1.emit(_ping);
        Schedules _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER_2 = this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER();
        _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER_2.cancel(taskVar);
      }
    };
    _$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER_1.every(taskVar, 5000, _function);
  }

  @Extension
  @ImportedCapacityFeature(DefaultContextInteractions.class)
  @SyntheticMember
  private transient AtomicSkillReference $CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS;

  @SyntheticMember
  @Pure
  private DefaultContextInteractions $CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS == null || this.$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS = $getSkill(DefaultContextInteractions.class);
    }
    return $castSkill(DefaultContextInteractions.class, this.$CAPACITY_USE$IO_SARL_API_CORE_DEFAULTCONTEXTINTERACTIONS);
  }

  @Extension
  @ImportedCapacityFeature(Schedules.class)
  @SyntheticMember
  private transient AtomicSkillReference $CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES;

  @SyntheticMember
  @Pure
  private Schedules $CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES == null || this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES.get() == null) {
      this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES = $getSkill(Schedules.class);
    }
    return $castSkill(Schedules.class, this.$CAPACITY_USE$IO_SARL_API_CORE_SCHEDULES);
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
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$1(occurrence));
  }

  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Pong(final Pong occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Pong$0(occurrence));
  }

  @SyntheticMember
  @Override
  public void $getSupportedEvents(final Set<Class<? extends Event>> toBeFilled) {
    super.$getSupportedEvents(toBeFilled);
    toBeFilled.add(Initialize.class);
    toBeFilled.add(Pong.class);
  }

  @SyntheticMember
  @Override
  public boolean $isSupportedEvent(final Class<? extends Event> event) {
    if (Initialize.class.isAssignableFrom(event)) {
      return true;
    }
    if (Pong.class.isAssignableFrom(event)) {
      return true;
    }
    return false;
  }

  @SyntheticMember
  @Override
  public void $evaluateBehaviorGuards(final Object event, final Collection<Runnable> callbacks) {
    super.$evaluateBehaviorGuards(event, callbacks);
    if (event instanceof Initialize) {
      final Initialize occurrence = (Initialize) event;
      $guardEvaluator$Initialize(occurrence, callbacks);
    }
    if (event instanceof Pong) {
      final Pong occurrence = (Pong) event;
      $guardEvaluator$Pong(occurrence, callbacks);
    }
  }

  @SyntheticMember
  public PingAgent(final UUID parentID, final UUID agentID) {
    super(parentID, agentID);
  }

  @SyntheticMember
  @Inject
  public PingAgent(final UUID parentID, final UUID agentID, final DynamicSkillProvider skillProvider) {
    super(parentID, agentID, skillProvider);
  }
}
