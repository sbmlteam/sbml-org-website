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

 Style information object used in {@link LocalRenderInformation}.
 <p>
 * Local styles are the style information objects used in
 * {@link LocalRenderInformation}.  Local styles can be associated with layout
 * objects by role and type as well as by id of layout objects from the
 * layout the local style belongs to.
 <p>
 * Since {@link LocalStyle} is derived from {@link Style}, it inherits all of the methods
 * and attributes from {@link Style}.
 <p>
 * @see LocalRenderInformation
 * @see Style
 */

public class LocalStyle extends Style {
   private long swigCPtr;

   protected LocalStyle(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.LocalStyle_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(LocalStyle obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (LocalStyle obj)
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
        libsbmlJNI.delete_LocalStyle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link LocalStyle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link LocalStyle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LocalStyle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LocalStyle}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 LocalStyle(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link LocalStyle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link LocalStyle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LocalStyle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LocalStyle}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 LocalStyle(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link LocalStyle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link LocalStyle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LocalStyle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LocalStyle}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 LocalStyle(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link LocalStyle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link LocalStyle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LocalStyle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LocalStyle}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 LocalStyle() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link LocalStyle} using the given {@link RenderPkgNamespaces} object.
   <p>
   * <p>
 * The package namespaces object used in this constructor is derived from a
 * {@link SBMLNamespaces} object, which encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and 
 * package version and name information used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * package namespace object somewhere in a program once, then hand that object
 * as needed to object constructors of that package that accept it as and
 * argument, such as this one.
   <p>
   * @param renderns the {@link RenderPkgNamespaces} object.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 LocalStyle(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link LocalStyle} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link LocalStyle} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link LocalStyle}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 LocalStyle(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link LocalStyle} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link LocalStyle} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link LocalStyle}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 LocalStyle(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_6(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Constructor which creates a {@link LocalStyle} with an empty group
   * and empty id, role and type list.
   * The group has to be filled before the
   * object is valid.
   <p>
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 LocalStyle(RenderPkgNamespaces renderns, String id) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_7(RenderPkgNamespaces.getCPtr(renderns), renderns, id), true);
  }

  
/**
   * Copy constructor for {@link LocalStyle}.
   <p>
   * @param orig the {@link LocalStyle} instance to copy.
   */ public
 LocalStyle(LocalStyle orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LocalStyle__SWIG_8(LocalStyle.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link LocalStyle} object.
   <p>
   * @return a (deep) copy of this {@link LocalStyle} object.
   */ public
 LocalStyle cloneObject() {
    long cPtr = libsbmlJNI.LocalStyle_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new LocalStyle(cPtr, true);
  }

  
/**
   * Returns the value of the 'idList' attribute of this {@link LocalStyle}.
   <p>
   * @return the value of the 'idList' attribute of this {@link LocalStyle} as a
   * string.
   */ public
 StringSet getIdList() {
    return new StringSet(libsbmlJNI.LocalStyle_getIdList__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the number of ids in the id set.
   <p>
   * @return the number of ids in the id set
   */ public
 long getNumIds() {
    return libsbmlJNI.LocalStyle_getNumIds(swigCPtr, this);
  }

  
/**
   * Checks whether a given <code>id</code> is in the id list.
   <p>
   * @param id the id to be searched for
   <p>
   * @return <code>true</code> or <code>false</code> depending on whether the given <code>id</code> is in the id list or not.
   */ public
 boolean isInIdList(String id) {
    return libsbmlJNI.LocalStyle_isInIdList(swigCPtr, this, id);
  }

  
/**
   * Adds another id to the set.
   <p>
   * @param id the id string to be added to the id list.
   */ public
 int addId(String id) {
    return libsbmlJNI.LocalStyle_addId(swigCPtr, this, id);
  }

  
/** 
   * @return the string of all roles
   */ public
 String createIdString() {
    return libsbmlJNI.LocalStyle_createIdString(swigCPtr, this);
  }

  
/**
   * Removes an id from the set.
   <p>
   * @param id the id to be removed from the id list.
   */ public
 int removeId(String id) {
    return libsbmlJNI.LocalStyle_removeId(swigCPtr, this, id);
  }

  
/**
   * Sets the id list.
   <p>
   * @param idList The list of ids to be set on the local style.
   */ public
 int setIdList(StringSet idList) {
    return libsbmlJNI.LocalStyle_setIdList(swigCPtr, this, StringSet.getCPtr(idList), idList);
  }

  
/**
   * Returns the XML element name of this {@link LocalStyle} object.
   <p>
   * For {@link LocalStyle}, the XML element name is always <code>'style'.</code>
   <p>
   * @return the name of this element, i.e. <code>'style'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.LocalStyle_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link LocalStyle} object.
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML type code for this object:
   * {@link libsbmlConstants#SBML_RENDER_LOCALSTYLE SBML_RENDER_LOCALSTYLE}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getTypeCode() {
    return libsbmlJNI.LocalStyle_getTypeCode(swigCPtr, this);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link LocalStyle} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link LocalStyle} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.LocalStyle_toXML(swigCPtr, this), true);
  }

}
