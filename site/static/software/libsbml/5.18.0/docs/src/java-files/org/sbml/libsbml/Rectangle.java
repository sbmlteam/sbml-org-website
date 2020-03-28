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

 Representation of a rectangle.
 <p>
 * {@link Rectangle} allows the definition of rectangles with or without rounded
 * edges.  The {@link Rectangle} object derives from the {@link GraphicalPrimitive2D} class
 * and thus inherits any attributes and elements that are present on this
 * class.  In addition, the {@link Rectangle} object has the required attributes 'x',
 * 'y', 'height', and 'width' as well as the optional attributes 'z', 'rx', 'ry' and
 * 'ratio'.
 */

public class Rectangle extends GraphicalPrimitive2D {
   private long swigCPtr;

   protected Rectangle(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.Rectangle_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(Rectangle obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (Rectangle obj)
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
        libsbmlJNI.delete_Rectangle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link Rectangle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Rectangle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Rectangle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Rectangle}.
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
 Rectangle(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link Rectangle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Rectangle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Rectangle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Rectangle}.
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
 Rectangle(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link Rectangle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Rectangle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Rectangle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Rectangle}.
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
 Rectangle(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link Rectangle} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Rectangle}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Rectangle}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Rectangle}.
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
 Rectangle() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link Rectangle} using the given {@link RenderPkgNamespaces} object.
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
 Rectangle(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link Rectangle} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link Rectangle} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link Rectangle}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 Rectangle(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link Rectangle} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link Rectangle} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link Rectangle}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 Rectangle(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_6(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Instantiates a new {@link Rectangle} object.
   * All attributes are set as described for the default constructor
   * of {@link GraphicalPrimitive2D}.
   <p>
   * The id is set to the given string and all rectangle specific attributes are set to 0.
   <p>
   * @param renderns the {@link SBMLNamespaces} object for the SBML 'render' package
   * @param id id string for the rectangle
   <p>
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 Rectangle(RenderPkgNamespaces renderns, String id) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_7(RenderPkgNamespaces.getCPtr(renderns), renderns, id), true);
  }

  
/**
   * Instantiates a new {@link Rectangle} object.
   * All attributes are set as described for the default constructor
   * of {@link GraphicalPrimitive2D}.
   <p>
   * The id is set to the given string and all rectangle specific attributes
   * are set to the given values.
   <p>
   * @param renderns the {@link SBMLNamespaces} object for the SBML 'render' package
   * @param id id string for the rectangle
   * @param x x coordinate of the position 
   * @param y y coordinate of the position 
   * @param z z coordinate of the position 
   * @param w w width
   * @param h h height
   <p>
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 Rectangle(RenderPkgNamespaces renderns, String id, RelAbsVector x, RelAbsVector y, RelAbsVector z, RelAbsVector w, RelAbsVector h) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_8(RenderPkgNamespaces.getCPtr(renderns), renderns, id, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z, RelAbsVector.getCPtr(w), w, RelAbsVector.getCPtr(h), h), true);
  }

  
/**
   * Instantiates a new {@link Rectangle} object.
   * All attributes are set as described for the default constructor
   * of {@link GraphicalPrimitive2D}.
   <p>
   * The id is set to the given string and all rectangle specific attributes
   * are set to the given values. The z coordinate of the position is set to 0.
   <p>
   * @param renderns the {@link SBMLNamespaces} object for the SBML 'render' package
   * @param id id string for the rectangle
   * @param x x coordinate of the position 
   * @param y y coordinate of the position 
   * @param w w width
   * @param h h height
   <p>
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 Rectangle(RenderPkgNamespaces renderns, String id, RelAbsVector x, RelAbsVector y, RelAbsVector w, RelAbsVector h) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_9(RenderPkgNamespaces.getCPtr(renderns), renderns, id, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(w), w, RelAbsVector.getCPtr(h), h), true);
  }

  
/**
   * Copy constructor for {@link Rectangle}.
   <p>
   * @param orig the {@link Rectangle} instance to copy.
   */ public
 Rectangle(Rectangle orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Rectangle__SWIG_10(Rectangle.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link Rectangle} object.
   <p>
   * @return a (deep) copy of this {@link Rectangle} object.
   */ public
 Rectangle cloneObject() {
    long cPtr = libsbmlJNI.Rectangle_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new Rectangle(cPtr, true);
  }

  
/**
   * Returns the value of the 'ratio' attribute of this {@link Rectangle}.
   <p>
   * @return the value of the 'ratio' attribute of this {@link Rectangle} as a double.
   */ public
 double getRatio() {
    return libsbmlJNI.Rectangle_getRatio(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'ratio' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'ratio' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetRatio() {
    return libsbmlJNI.Rectangle_isSetRatio(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'ratio' attribute of this {@link Rectangle}.
   <p>
   * @param ratio double value of the 'ratio' attribute to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * {@link OperationReturnValues_t}}
   * </ul>
   */ public
 int setRatio(double ratio) {
    return libsbmlJNI.Rectangle_setRatio(swigCPtr, this, ratio);
  }

  
/**
   * Unsets the value of the 'ratio' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetRatio() {
    return libsbmlJNI.Rectangle_unsetRatio(swigCPtr, this);
  }

  
/**
   * Returns the x coordinate of the rectangle's position
   <p>
   * @return  reference to {@link RelAbsVector} that represents the x position
   */ public
 RelAbsVector getX() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getX__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the y coordinate of the rectangle's position
   <p>
   * @return  reference to {@link RelAbsVector} that represents the y position
   */ public
 RelAbsVector getY() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getY__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the z coordinate of the rectangle's position
   <p>
   * @return  reference to {@link RelAbsVector} that represents the z position
   */ public
 RelAbsVector getZ() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getZ__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the with of the rectangle
   <p>
   * @return  reference to the {@link RelAbsVector} that represents the width
   */ public
 RelAbsVector getWidth() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getWidth__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the height of the rectangle
   <p>
   * @return  reference to the {@link RelAbsVector} that represents the height
   */ public
 RelAbsVector getHeight() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getHeight__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'rX' element of this {@link Rectangle}.
   <p>
   * @return the value of the 'rX' element of this {@link Rectangle} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getRX() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getRX__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the corner radius along the x axis
   <p>
   * @return  reference to the {@link RelAbsVector} that corner radius along the x axis
   */ public
 RelAbsVector getRadiusX() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getRadiusX__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'rY' element of this {@link Rectangle}.
  <p>
  * @return the value of the 'rY' element of this {@link Rectangle} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getRY() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getRY__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the corner radius along the y axis
   <p>
   * @return  reference to the {@link RelAbsVector} that corner radius along the y axis
   */ public
 RelAbsVector getRadiusY() {
    return new RelAbsVector(libsbmlJNI.Rectangle_getRadiusY__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'x' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'x' attribute has been set, otherwise
   * <code>false</code> is returned.
   */ public
 boolean isSetX() {
    return libsbmlJNI.Rectangle_isSetX(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'y' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'y' attribute has been set, otherwise
   * <code>false</code> is returned.
   */ public
 boolean isSetY() {
    return libsbmlJNI.Rectangle_isSetY(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'z' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'z' attribute has been set, otherwise
   * <code>false</code> is returned.
   */ public
 boolean isSetZ() {
    return libsbmlJNI.Rectangle_isSetZ(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'width' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'width' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetWidth() {
    return libsbmlJNI.Rectangle_isSetWidth(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'height' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'height' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetHeight() {
    return libsbmlJNI.Rectangle_isSetHeight(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'rX' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'rX' attribute has been set, otherwise
   * <code>false</code> is returned.
   */ public
 boolean isSetRX() {
    return libsbmlJNI.Rectangle_isSetRX(swigCPtr, this);
  }

  
/**
  * Predicate returning <code>true</code> if this {@link Rectangle}'s 'rX' attribute is set.
  <p>
  * @return <code>true</code> if this {@link Rectangle}'s 'rX' attribute has been set, otherwise
  * <code>false</code> is returned.
  */ public
 boolean isSetRadiusX() {
    return libsbmlJNI.Rectangle_isSetRadiusX(swigCPtr, this);
  }

  
/**
  * Predicate returning <code>true</code> if this {@link Rectangle}'s 'rY' attribute is set.
  <p>
  * @return <code>true</code> if this {@link Rectangle}'s 'rY' attribute has been set, otherwise
  * <code>false</code> is returned.
  */ public
 boolean isSetRY() {
    return libsbmlJNI.Rectangle_isSetRY(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link Rectangle}'s 'rY' attribute is set.
   <p>
   * @return <code>true</code> if this {@link Rectangle}'s 'rY' attribute has been set, otherwise
   * <code>false</code> is returned.
   */ public
 boolean isSetRadiusY() {
    return libsbmlJNI.Rectangle_isSetRadiusY(swigCPtr, this);
  }

  
/**
   * Sets the position and the size of the {@link Rectangle} within the viewport.
   <p>
   * @param x x coordinate of the position 
   * @param y y coordinate of the position 
   * @param z z coordinate of the position 
   * @param w w width
   * @param h h height
   */ public
 void setCoordinatesAndSize(RelAbsVector x, RelAbsVector y, RelAbsVector z, RelAbsVector w, RelAbsVector h) {
    libsbmlJNI.Rectangle_setCoordinatesAndSize(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z, RelAbsVector.getCPtr(w), w, RelAbsVector.getCPtr(h), h);
  }

  
/**
   * Sets the position of the {@link Rectangle} within the viewport.
   <p>
   * @param x x coordinate of the position 
   * @param y y coordinate of the position 
   * @param z z coordinate of the position 
   */ public
 void setCoordinates(RelAbsVector x, RelAbsVector y, RelAbsVector z) {
    libsbmlJNI.Rectangle_setCoordinates(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the size of the {@link Rectangle} 
   <p>
   * @param w w width
   * @param h h height
   */ public
 void setSize(RelAbsVector w, RelAbsVector h) {
    libsbmlJNI.Rectangle_setSize(swigCPtr, this, RelAbsVector.getCPtr(w), w, RelAbsVector.getCPtr(h), h);
  }

  
/**
   * Sets the two corner radii of the rectangle
   <p>
   * @param rx corner radius along the x axis
   * @param ry corner radius along the y axis
   */ public
 void setRadii(RelAbsVector rx, RelAbsVector ry) {
    libsbmlJNI.Rectangle_setRadii(swigCPtr, this, RelAbsVector.getCPtr(rx), rx, RelAbsVector.getCPtr(ry), ry);
  }

  
/**
   * Sets the x position of the {@link Rectangle} within the viewport.
   <p>
   * @param x x coordinate of the position 
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setX(RelAbsVector x) {
    return libsbmlJNI.Rectangle_setX(swigCPtr, this, RelAbsVector.getCPtr(x), x);
  }

  
/**
   * Sets the y position of the {@link Rectangle} within the viewport.
   <p>
   * @param y y coordinate of the position 
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setY(RelAbsVector y) {
    return libsbmlJNI.Rectangle_setY(swigCPtr, this, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Sets the z position of the {@link Rectangle} within the viewport.
   <p>
   * @param z z coordinate of the position 
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setZ(RelAbsVector z) {
    return libsbmlJNI.Rectangle_setZ(swigCPtr, this, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the width of the {@link Rectangle} 
   <p>
   * @param w w width
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setWidth(RelAbsVector w) {
    return libsbmlJNI.Rectangle_setWidth(swigCPtr, this, RelAbsVector.getCPtr(w), w);
  }

  
/**
   * Sets the height of the {@link Rectangle} 
   <p>
   * @param h h height
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setHeight(RelAbsVector h) {
    return libsbmlJNI.Rectangle_setHeight(swigCPtr, this, RelAbsVector.getCPtr(h), h);
  }

  
/**
   * Sets the corner radius along the x axis
   <p>
   * @param rx corner radius along the x axis
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setRadiusX(RelAbsVector rx) {
    return libsbmlJNI.Rectangle_setRadiusX(swigCPtr, this, RelAbsVector.getCPtr(rx), rx);
  }

  
/**
  * Sets the corner radius along the x axis
  <p>
  * @param rx corner radius along the x axis
  <p>
  * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
  * <ul>
  * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
  * </ul>
  */ public
 int setRX(RelAbsVector rx) {
    return libsbmlJNI.Rectangle_setRX(swigCPtr, this, RelAbsVector.getCPtr(rx), rx);
  }

  
/**
   * Sets the corner radius along the y axis
   <p>
   * @param ry corner radius along the y axis
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setRadiusY(RelAbsVector ry) {
    return libsbmlJNI.Rectangle_setRadiusY(swigCPtr, this, RelAbsVector.getCPtr(ry), ry);
  }

  
/**
  * Sets the corner radius along the y axis
  <p>
  * @param ry corner radius along the y axis
  <p>
  * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
  * <ul>
  * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
  * </ul>
  */ public
 int setRY(RelAbsVector ry) {
    return libsbmlJNI.Rectangle_setRY(swigCPtr, this, RelAbsVector.getCPtr(ry), ry);
  }

  
/**
   * Unsets the value of the 'x' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetX() {
    return libsbmlJNI.Rectangle_unsetX(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'y' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetY() {
    return libsbmlJNI.Rectangle_unsetY(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'z' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetZ() {
    return libsbmlJNI.Rectangle_unsetZ(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'width' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetWidth() {
    return libsbmlJNI.Rectangle_unsetWidth(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'height' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetHeight() {
    return libsbmlJNI.Rectangle_unsetHeight(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'rX' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetRadiusX() {
    return libsbmlJNI.Rectangle_unsetRadiusX(swigCPtr, this);
  }

  
/**
  * Unsets the value of the 'rX' attribute of this {@link Rectangle}.
  <p>
  * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
  * <ul>
  * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
  * </ul>
  */ public
 int unsetRX() {
    return libsbmlJNI.Rectangle_unsetRX(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'rY' attribute of this {@link Rectangle}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetRadiusY() {
    return libsbmlJNI.Rectangle_unsetRadiusY(swigCPtr, this);
  }

  
/**
  * Unsets the value of the 'rY' attribute of this {@link Rectangle}.
  <p>
  * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
  * <ul>
  * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
  * </ul>
  */ public
 int unsetRY() {
    return libsbmlJNI.Rectangle_unsetRY(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this {@link Rectangle} object.
   <p>
   * For {@link Rectangle}, the XML element name is always <code>'rectangle'.</code>
   <p>
   * @return the name of this element, i.e. <code>'rectangle'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.Rectangle_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link Rectangle} object.
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
   * {@link libsbmlConstants#SBML_RENDER_RECTANGLE SBML_RENDER_RECTANGLE}.
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
    return libsbmlJNI.Rectangle_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes for this
   * {@link Rectangle} object have been set.
   <p>
   * @return <code>true</code> to indicate that all the required attributes of this
   * {@link Rectangle} have been set, otherwise <code>false</code> is returned.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.Rectangle_hasRequiredAttributes(swigCPtr, this);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link Rectangle} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link Rectangle} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.Rectangle_toXML(swigCPtr, this), true);
  }

}
