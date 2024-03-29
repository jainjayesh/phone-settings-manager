/**
 * Copyright 2011 Jay Goldman
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed 
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language 
 * governing permissions and limitations under the License. 
 */
package com.mgjg.ProfileManager.utils;

import com.mgjg.ProfileManager.provider.Providee;

/**
 * Classes that implement this interface can be managed by the ListAdapter
 * 
 * @author Jay Goldman
 * 
 */
public interface Listable extends Providee, Comparable<Listable>
{
  long getId();

  boolean isEnabled();

  int getListOrder();
}
