/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-render"><a href="group__render.html">render</a></span>

 A list of layout objects used by the 'render' extension.
 <p>
 * The Render package extends the {@link ListOfLayouts} object from the {@link Layout} package 
 * with the addition of an optional {@link ListOfGlobalRenderInformation} object.
 */

public class RenderListOfLayoutsPlugin extends SBasePlugin {
   private long swigCPtr;

   protected RenderListOfLayoutsPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.RenderListOfLayoutsPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(RenderListOfLayoutsPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (RenderListOfLayoutsPlugin obj)
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
        libsbmlJNI.delete_RenderListOfLayoutsPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Constructor
   */ public
 RenderListOfLayoutsPlugin(String uri, String prefix, RenderPkgNamespaces groupsns) {
    this(libsbmlJNI.new_RenderListOfLayoutsPlugin__SWIG_0(uri, prefix, RenderPkgNamespaces.getCPtr(groupsns), groupsns), true);
  }

  
/**
   * Copy constructor. Creates a copy of this {@link SBase} object.
   */ public
 RenderListOfLayoutsPlugin(RenderListOfLayoutsPlugin orig) {
    this(libsbmlJNI.new_RenderListOfLayoutsPlugin__SWIG_1(RenderListOfLayoutsPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link RenderListOfLayoutsPlugin}  object.
   <p>
   * @return a (deep) copy of this {@link RenderListOfLayoutsPlugin} object
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.RenderListOfLayoutsPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new RenderListOfLayoutsPlugin(cPtr, true);
  }

  
/** * @internal */ public
 boolean hasRequiredElements() {
    return libsbmlJNI.RenderListOfLayoutsPlugin_hasRequiredElements(swigCPtr, this);
  }

  
/** * @internal */ public
 int appendFrom(Model model) {
    return libsbmlJNI.RenderListOfLayoutsPlugin_appendFrom(swigCPtr, this, Model.getCPtr(model), model);
  }

  
/**
   * Returns a pointer to the list object that contains local render information.
   */ public
 ListOfGlobalRenderInformation getListOfGlobalRenderInformation() {
    long cPtr = libsbmlJNI.RenderListOfLayoutsPlugin_getListOfGlobalRenderInformation__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfGlobalRenderInformation(cPtr, false);
  }

  
/**
   * Returns the number of local render information objects.
   */ public
 long getNumGlobalRenderInformationObjects() {
    return libsbmlJNI.RenderListOfLayoutsPlugin_getNumGlobalRenderInformationObjects(swigCPtr, this);
  }

  
/**
   * Returns a pointer to the local render information object with the given
   * index.
   * If the index is invalid, <code>null</code> is returned.
   */ public
 GlobalRenderInformation getRenderInformation(long index) {
    long cPtr = libsbmlJNI.RenderListOfLayoutsPlugin_getRenderInformation__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/**
   * Returns a pointer to the local render information object with the given
   * id.
   * If no object with the given <code>id</code> exists, <code>null</code> is returned.
   */ public
 GlobalRenderInformation getRenderInformation(String id) {
    long cPtr = libsbmlJNI.RenderListOfLayoutsPlugin_getRenderInformation__SWIG_2(swigCPtr, this, id);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/**
   * Adds a copy of the given local render information object to the list of
   * local render information objects.
   * If an object with the same id exists, it is replaced.
   */ public
 void addGlobalRenderInformation(GlobalRenderInformation pLRI) {
    libsbmlJNI.RenderListOfLayoutsPlugin_addGlobalRenderInformation(swigCPtr, this, GlobalRenderInformation.getCPtr(pLRI), pLRI);
  }

  
/**
   * Creates a new local render information object and adds it to the list.
   * The created object does not have a id and it is the responsibility of
   * the calling code to ensure that it gets one.
   * For constraints on the id, please consult the render information document.
   */ public
 GlobalRenderInformation createGlobalRenderInformation() {
    long cPtr = libsbmlJNI.RenderListOfLayoutsPlugin_createGlobalRenderInformation(swigCPtr, this);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/**
   * Removed the render information with the given index from the list.
   * The removed object is returned. It is the responsibility of the calling
   * code to delete the object.
   * If the index is not valid, <code>null</code> is returned.
   */ public
 GlobalRenderInformation removeGlobalRenderInformation(long index) {
    long cPtr = libsbmlJNI.RenderListOfLayoutsPlugin_removeGlobalRenderInformation__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/**
   * Removed the render information with the given <code>id</code> from the list.
   * The removed object is returned. It is the responsibility of the calling
   * code to delete the object.
   * If an object with the given <code>id</code> does not exist, <code>null</code> is returned.
   */ public
 GlobalRenderInformation removeGlobalRenderInformation(String id) {
    long cPtr = libsbmlJNI.RenderListOfLayoutsPlugin_removeGlobalRenderInformation__SWIG_1(swigCPtr, this, id);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/** * @internal */ public
 void connectToParent(SBase sbase) {
    libsbmlJNI.RenderListOfLayoutsPlugin_connectToParent(swigCPtr, this, SBase.getCPtr(sbase), sbase);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.RenderListOfLayoutsPlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

  
/** * @internal */ public
 void parseAnnotation() {
    libsbmlJNI.RenderListOfLayoutsPlugin_parseAnnotation(swigCPtr, this);
  }

}
