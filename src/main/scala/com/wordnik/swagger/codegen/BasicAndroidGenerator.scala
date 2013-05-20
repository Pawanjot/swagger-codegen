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
    
      // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replaceAll("\\.", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
      ("JsonUtil.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replaceAll("\\.", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replaceAll("\\.", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
      ("NetworkHandler.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replaceAll("\\.", java.io.File.separator) + java.io.File.separator, "NetworkHandler.java")
      )
}