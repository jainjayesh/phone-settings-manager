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
package com.mgjg.ProfileManager.registry;

public class UnknownAttributeException extends Exception
{

  private static final long serialVersionUID = 1L;

  private final String name;
  private final int type;

  UnknownAttributeException(String attributeName)
  {
    super("Attribute name '" + attributeName + "' is not known"); // TODO need string resource
    this.name = attributeName;
    this.type = 0;
  }

  UnknownAttributeException(int type)
  {
    super("Attribute type '" + type + "' is not known"); // TODO need string resource
    this.type = type;
    this.name = "";
  }

  public String getName()
  {
    return name;
  }

  public int getType()
  {
    return type;
  }
}
