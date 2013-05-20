/*
 * Copyrights (C) BSB 2013.
 */

package com.wordnik.swagger.codegen

import com.wordnik.swagger.model._

object BasicAndroidGenerator extends BasicJavaGenerator {
}

class BasicAndroidGenerator extends BasicJavaGenerator {
    // location of templates
  override def templateDir = "android"  
}