/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-fbc"><a href="group__fbc.html">fbc</a></span>
 Extension of {@link SBMLDocument} for the &ldquo;fbc&rdquo; package.
 <p>
 * The {@link FbcSBMLDocumentPlugin} class inherits from the {@link SBMLDocumentPlugin}
 * class, and codifies the extensions to the {@link SBMLDocument} class defined in
 * the SBML Level&nbsp;3 <a href='../../../extensions-summary.html#fbc'>Flux Balance Constraints</a> (&ldquo;fbc&rdquo;) package.  This
 * extension defines a required flag named 'required', which indicates
 * whether &ldquo;fbc&rdquo; constructs can be used to change the core
 * mathematical interpretation of the {@link Model} defined in the SBML input.  Since
 * &ldquo;fbc&rdquo; constructs cannot, this attribute must be set to the
 * value <code>'false'.</code>
 */

public class FbcSBMLDocumentPlugin extends SBMLDocumentPlugin {
   private long swigCPtr;

   protected FbcSBMLDocumentPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.FbcSBMLDocumentPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(FbcSBMLDocumentPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (FbcSBMLDocumentPlugin obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_FbcSBMLDocumentPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link FbcSBMLDocumentPlugin} object using the given parameters.
   <p>
   * <p>
 * In the XML representation of an SBML document, XML namespaces are used to
 * identify the origin of each XML construct used.  XML namespaces are
 * identified by their unique resource identifiers (URIs).  The core SBML
 * specifications stipulate the namespaces that must be used for core SBML
 * constructs; for example, all XML elements that belong to SBML Level&nbsp;3
 * Version&nbsp;1 Core must be placed in the XML namespace identified by the URI
 * <code>'http://www.sbml.org/sbml/level3/version1/core'</code>.  Individual
 * SBML Level&nbsp;3 packages define their own XML namespaces; for example,
 * all elements belonging to the SBML Level&nbsp;3 Layout Version&nbsp;1
 * package must be placed in the XML namespace
 * <code>'http://www.sbml.org/sbml/level3/version1/layout/version1/'</code>.
   <p>
   * <p>
 * The {@link SBMLNamespaces} object encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and (in
 * Level&nbsp;3) packages used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * {@link SBMLNamespaces} object somewhere in a program once, then hand that object
 * as needed to object constructors that accept {@link SBMLNamespaces} as arguments.
   <p>
   * @param uri the URI of the SBML Level&nbsp;3 package implemented by
   * this libSBML package extension.
   <p>
   * @param prefix the XML namespace prefix being used for the package.
   <p>
   * @param fbcns the namespaces object for the package.
   */ public
 FbcSBMLDocumentPlugin(String uri, String prefix, FbcPkgNamespaces fbcns) {
    this(libsbmlJNI.new_FbcSBMLDocumentPlugin__SWIG_0(uri, prefix, FbcPkgNamespaces.getCPtr(fbcns), fbcns), true);
  }

  
/**
   * Copy constructor for {@link FbcSBMLDocumentPlugin}.
   <p>
   * @param orig the {@link FbcSBMLDocumentPlugin} instance to copy.
   */ public
 FbcSBMLDocumentPlugin(FbcSBMLDocumentPlugin orig) {
    this(libsbmlJNI.new_FbcSBMLDocumentPlugin__SWIG_1(FbcSBMLDocumentPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link FbcSBMLDocumentPlugin} object.
   <p>
   * @return a (deep) copy of this {@link FbcSBMLDocumentPlugin} object.
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.FbcSBMLDocumentPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new FbcSBMLDocumentPlugin(cPtr, true);
  }

  
/** * @internal */ public
 boolean isCompFlatteningImplemented() {
    return libsbmlJNI.FbcSBMLDocumentPlugin_isCompFlatteningImplemented(swigCPtr, this);
  }

  
/** * @internal */ public
 long checkConsistency() {
    return libsbmlJNI.FbcSBMLDocumentPlugin_checkConsistency(swigCPtr, this);
  }

}
