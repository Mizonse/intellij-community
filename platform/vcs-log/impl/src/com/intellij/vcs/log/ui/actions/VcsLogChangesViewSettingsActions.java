/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.vcs.log.ui.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.vcs.log.ui.VcsLogActionPlaces;
import org.jetbrains.annotations.NotNull;

public class VcsLogChangesViewSettingsActions extends VcsLogGearActionGroup {

  public VcsLogChangesViewSettingsActions() {
    super(VcsLogActionPlaces.CHANGE_VIEW_SETTINGS_ACTION_GROUP);
  }

  @Override
  public void update(@NotNull AnActionEvent e) {
    if (e.isFromContextMenu()) {
      e.getPresentation().setEnabledAndVisible(false);
    }
    else {
      super.update(e);
    }
  }
}
