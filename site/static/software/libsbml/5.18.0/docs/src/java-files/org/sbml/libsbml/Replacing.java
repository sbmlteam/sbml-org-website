/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-comp"><a href="group__comp.html">comp</a></span>
 Convenience class.
 <p>
 * The {@link Replacing} class does not exist officialy in the the <a href='../../../extensions-summary.html#comp'>Hierarchical Model Composition</a>
 * (&ldquo;comp&rdquo;) package, but is implemented here as a convenience
 * subclass of the {@link ReplacedElement} and {@link ReplacedBy} classes, since both of
 * those classes define a 'submodelRef' attribute.
 <p>
 * The required attribute 'submodelRef' takes a value of type
 * SIdRef, which must be the identifier of a {@link Submodel} object in
 * the containing model.  The model referenced by the
 * {@link Submodel} object establishes the object namespaces for the
 * 'portRef', 'idRef', 'unitRef' and 'metaIdRef'
 * attributes: only objects within the {@link Model} object may be referenced by
 * those attributes.
 */

public class Replacing extends SBaseRef {
   private long swigCPtr;

   protected Replacing(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.Replacing_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(Replacing obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (Replacing obj)
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
        libsbmlJNI.delete_Replacing(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Returns the value of the 'submodelRef' attribute of this {@link SBaseRef}.
   <p>
   * @return the value of the 'submodelRef' attribute of this {@link SBaseRef}.
   */ public
 String getSubmodelRef() {
    return libsbmlJNI.Replacing_getSubmodelRef(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> or <code>false</code> depending on whether this
   * {@link SBaseRef}'s 'submodelRef' attribute has been set.
   <p>
   * @return <code>true</code> if this {@link SBaseRef}'s 'submodelRef' attribute has been set, 
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetSubmodelRef() {
    return libsbmlJNI.Replacing_isSetSubmodelRef(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'submodelRef' attribute of this {@link SBaseRef}.  Fails
   * if the id is not a valid syntax for an SIdRef.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setSubmodelRef(String id) {
    return libsbmlJNI.Replacing_setSubmodelRef(swigCPtr, this, id);
  }

  
/**
   * Unsets the value of the 'SubmodelRef' attribute of this {@link SBaseRef}.
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
 int unsetSubmodelRef() {
    return libsbmlJNI.Replacing_unsetSubmodelRef(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if getNumReferents() is exactly 1 and if the submodelRef is set.
   <p>
   * @return boolean: 'true' if the attributes are correctly set; 'false' if not.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.Replacing_hasRequiredAttributes(swigCPtr, this);
  }

  
/**
   * Finds and stores the referenced object.  Finds the {@link Submodel} to which
   * it refers, getting the instantiated {@link Model} inside that {@link Submodel}, calling
   * 'getReferencedElementFrom' on that model, and storing the result.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int saveReferencedElement() {
    return libsbmlJNI.Replacing_saveReferencedElement(swigCPtr, this);
  }

  
/**
   * <p>
 * Replaces all uses of a given <code>SIdRef</code> type attribute value with another
 * value.
 <p>
 * <p>
 * In SBML, object identifiers are of a data type called <code>SId</code>.
 * In SBML Level&nbsp;3, an explicit data type called <code>SIdRef</code> was
 * introduced for attribute values that refer to <code>SId</code> values; in
 * previous Levels of SBML, this data type did not exist and attributes were
 * simply described to as 'referring to an identifier', but the effective
 * data type was the same as <code>SIdRef</code> in Level&nbsp;3.  These and
 * other methods of libSBML refer to the type <code>SIdRef</code> for all
 * Levels of SBML, even if the corresponding SBML specification did not
 * explicitly name the data type.
 <p>
 * This method works by looking at all attributes and (if appropriate)
 * mathematical formulas in MathML content, comparing the referenced
 * identifiers to the value of <code>oldid</code>.  If any matches are found, the
 * matching values are replaced with <code>newid</code>.  The method does <em>not</em>
 * descend into child elements.
 <p>
 * @param oldid the old identifier.
 * @param newid the new identifier.
   */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.Replacing_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/**
   * DEPRECATED FUNCTION:  DO NOT USE
   <p>
   * To retain old functionality, this function calls performReplacementAndCollect,
   * and then actually removes the now-redundant element.  However, this can lead
   * to doubly-deleted elements, as well as the incorrect interpretation of some
   * models.  The replacement function performReplacementAndCollect
   * has been marked protected, in the hopes that people will instead simply
   * use CompModelPlugin.instantiateSubmodels, which hides all the complexity while
   * still allowing access to a non-flattened version of a hierarchical model.
   */ public
 int performReplacement() {
    return libsbmlJNI.Replacing_performReplacement(swigCPtr, this);
  }

  
/** * @internal */ public
 int replaceWithAndMaybeDelete(SBase replacement, boolean deleteme, ASTNode conversionFactor) {
    return libsbmlJNI.Replacing_replaceWithAndMaybeDelete(swigCPtr, this, SBase.getCPtr(replacement), replacement, deleteme, ASTNode.getCPtr(conversionFactor), conversionFactor);
  }

}
