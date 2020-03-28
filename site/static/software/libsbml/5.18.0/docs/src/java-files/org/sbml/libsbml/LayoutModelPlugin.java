/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-layout"><a href="group__layout.html">layout</a></span>

 Extension of {@link Model}.
 */

public class LayoutModelPlugin extends SBasePlugin {
   private long swigCPtr;

   protected LayoutModelPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.LayoutModelPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(LayoutModelPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (LayoutModelPlugin obj)
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
        libsbmlJNI.delete_LayoutModelPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link LayoutModelPlugin} object using the given parameters.
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
   * @param layoutns the namespaces object for the package.
   */ public
 LayoutModelPlugin(String uri, String prefix, LayoutPkgNamespaces layoutns) {
    this(libsbmlJNI.new_LayoutModelPlugin__SWIG_0(uri, prefix, LayoutPkgNamespaces.getCPtr(layoutns), layoutns), true);
  }

  
/**
   * Copy constructor. Creates a copy of this {@link SBase} object.
   <p>
   * @param orig the instance to copy.
   */ public
 LayoutModelPlugin(LayoutModelPlugin orig) {
    this(libsbmlJNI.new_LayoutModelPlugin__SWIG_1(LayoutModelPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link LayoutModelPlugin} object.
   <p>
   * @return a (deep) copy of this {@link LayoutModelPlugin} object.
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.LayoutModelPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new LayoutModelPlugin(cPtr, true);
  }

  
/**
   * Returns the {@link ListOfLayouts} object for this {@link Model}.
   <p>
   * @return the {@link ListOfLayouts} object for this {@link Model}.
   */ public
 ListOfLayouts getListOfLayouts() {
    long cPtr = libsbmlJNI.LayoutModelPlugin_getListOfLayouts__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfLayouts(cPtr, false);
  }

  
/**
   * Returns the layout object that belongs to the given index. If the
   * index is invalid, <code>null</code> is returned.
   <p>
   * @param index the index of list of layout objects.
   <p>
   * @return the {@link Layout} object that belongs to the given index. null
   * is returned if the index is invalid. 
   */ public
 Layout getLayout(long index) {
    long cPtr = libsbmlJNI.LayoutModelPlugin_getLayout__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Layout(cPtr, false);
  }

  
/**
   * Returns the layout object with the given <code>sid</code> attribute. If the
   * id is invalid, <code>null</code> is returned.
   <p>
   * @param sid the id attribute of the layout object.
   <p>
   * @return the {@link Layout} object with the given <code>sid</code> attribute. null
   * is returned if the given <code>sid</code> is invalid. 
   */ public
 Layout getLayout(String sid) {
    long cPtr = libsbmlJNI.LayoutModelPlugin_getLayout__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Layout(cPtr, false);
  }

  
/**
   * Adds a copy of the layout object to the list of layouts.
   <p>
   * @param layout the layout object to be added.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * <li> {@link libsbmlConstants#LIBSBML_LEVEL_MISMATCH LIBSBML_LEVEL_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_VERSION_MISMATCH LIBSBML_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_PKG_VERSION_MISMATCH LIBSBML_PKG_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_DUPLICATE_OBJECT_ID LIBSBML_DUPLICATE_OBJECT_ID}
   * </ul>
   */ public
 int addLayout(Layout layout) {
    return libsbmlJNI.LayoutModelPlugin_addLayout(swigCPtr, this, Layout.getCPtr(layout), layout);
  }

  
/**
   * Creates a new layout object and adds it to the list of layout objects
   * and returns it.
   <p>
   * @return a new layout object.
   */ public
 Layout createLayout() {
    long cPtr = libsbmlJNI.LayoutModelPlugin_createLayout(swigCPtr, this);
    return (cPtr == 0) ? null : new Layout(cPtr, false);
  }

  
/**
   * Removes the nth {@link Layout} object from this {@link Model} object and
   * returns a pointer to it.
   <p>
   * The caller owns the returned object and is responsible for deleting it.
   <p>
   * @param n the index of the {@link Layout} object to remove.
   <p>
   * @return the {@link Layout} object removed.  As mentioned above, the caller owns the
   * returned object. <code>null</code> is returned if the given index is out of range.
   */ public
 Layout removeLayout(long n) {
    long cPtr = libsbmlJNI.LayoutModelPlugin_removeLayout(swigCPtr, this, n);
    return (cPtr == 0) ? null : new Layout(cPtr, false);
  }

  
/**
   * Returns the number of layout objects.
   <p>
   * @return the number of layout objects.
   */ public
 int getNumLayouts() {
    return libsbmlJNI.LayoutModelPlugin_getNumLayouts(swigCPtr, this);
  }

  
/** * @internal */ public
 int appendFrom(Model model) {
    return libsbmlJNI.LayoutModelPlugin_appendFrom(swigCPtr, this, Model.getCPtr(model), model);
  }

  
/** * @internal */ public
 void connectToParent(SBase sbase) {
    libsbmlJNI.LayoutModelPlugin_connectToParent(swigCPtr, this, SBase.getCPtr(sbase), sbase);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.LayoutModelPlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
