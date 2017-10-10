/*
 * Copyright 2000-2014 JetBrains s.r.o.
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
package com.intellij.util.xml.impl;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.DomFileDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author peter
*/
public class MockDomFileDescription<T> extends DomFileDescription<T> {
  private final VirtualFile myFile;

  public MockDomFileDescription(final Class<T> aClass, final String rootTagName, @Nullable VirtualFile file) {
    super(aClass, rootTagName);
    myFile = file;
  }

  @Override
  public boolean isMyFile(@NotNull final XmlFile xmlFile, final Module module) {
    return xmlFile.getViewProvider().getVirtualFile().equals(myFile);
  }

  @Override
  public boolean acceptsOtherRootTagNames() {
    return true;
  }

  @Override
  protected void initializeFileDescription() {
  }

  @Override
  public boolean isAutomaticHighlightingEnabled() {
    return false;
  }
}
