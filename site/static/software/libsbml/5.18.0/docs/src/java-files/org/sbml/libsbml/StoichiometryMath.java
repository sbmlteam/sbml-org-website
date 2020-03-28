/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Stochiometry expressions in SBML Level 2 reactions.
 <p>
 * <h2>Stoichiometries in SBML Level 2</h2>
 <p>
 * In SBML Level 2, product and reactant stoichiometries can be specified
 * using <em>either</em> the 'stoichiometry' attribute or a 'stoichiometryMath'
 * element in a {@link SpeciesReference} object.  The 'stoichiometry' attribute is
 * of type <code>double</code> and should contain values greater than zero (0).  The
 * 'stoichiometryMath' element is implemented as an element containing a
 * MathML expression.  These two are mutually exclusive; only one of
 * 'stoichiometry' or 'stoichiometryMath' should be defined in a given
 * {@link SpeciesReference} instance.  When neither the attribute nor the element
 * is present, the value of 'stoichiometry' in the enclosing
 * {@link SpeciesReference} instance defaults to <code>1.</code>
 <p>
 * For maximum interoperability, {@link SpeciesReference}'s 'stoichiometry'
 * attribute should be used in preference to 'stoichiometryMath' when a
 * species' stoichiometry is a simple scalar number (integer or decimal).
 * When the stoichiometry is a rational number, or when it is a more
 * complicated formula, 'stoichiometryMath' must be used.  The MathML
 * expression in 'stoichiometryMath' may also refer to identifiers of
 * entities in a model (except reaction identifiers).  However, the only
 * species identifiers that can be used in 'stoichiometryMath' are those
 * referenced in the enclosing {@link Reaction}'s list of reactants, products and
 * modifiers.
 <p>
 * The 'stoichiometry' attribute and the 'stoichiometryMath' element, when
 * either is used, is each interpreted as a factor applied to the reaction
 * rate to produce the rate of change of the species identified by the
 * 'species' attribute in the enclosing {@link SpeciesReference}.  This is the
 * normal interpretation of a stoichiometry, but in SBML, one additional
 * consideration has to be taken into account.  The reaction rate, which is
 * the result of the {@link KineticLaw}'s 'math' element, is always in the model's
 * <em>substance</em> per <em>time</em> units.  However, the rate of change of the
 * species will involve the species' <em>substance</em> units (i.e., the units
 * identified by the {@link Species} object's 'substanceUnits' attribute), and
 * these units may be different from the model's default <em>substance</em>
 * units.  If the units <em>are</em> different, the stoichiometry must
 * incorporate a conversion factor for converting the model's <em>substance</em>
 * units to the species' <em>substance</em> units.  The conversion factor is
 * assumed to be included in the scalar value of the 'stoichiometry'
 * attribute if 'stoichiometry' is used.  If instead 'stoichiometryMath' is
 * used, then the product of the model's 'substance' units times the
 * 'stoichiometryMath' units must match the <em>substance</em> units of the
 * species.  Note that in either case, if the species' units and the
 * model's default <em>substance</em> units are the same, the stoichiometry ends
 * up being a dimensionless number and equivalent to the standard chemical
 * stoichiometry found in textbooks.  Examples and more explanations of
 * this are given in the SBML specification.
 <p>
 * The following is a simple example of a species reference for species
 * <code>'X0'</code>, with stoichiometry <code>2</code>, in a list of reactants within a reaction
 * having the identifier <code>'J1':</code>
 * <pre class='fragment'>
 &lt;model&gt;
     ...
     &lt;listOfReactions&gt;
         &lt;reaction id='J1'&gt;
             &lt;listOfReactants&gt;
                 &lt;speciesReference species='X0' stoichiometry='2'&gt;
             &lt;/listOfReactants&gt;
             ...
         &lt;/reaction&gt;
         ...
     &lt;/listOfReactions&gt;
     ...
 &lt;/model&gt;
 </pre>
 <p>
 * The following is a more complex example of a species reference for
 * species <code>'X0'</code>, with a stoichiometry formula consisting of
 * a rational number:
 * <pre class='fragment'>
 &lt;model&gt;
     ...
     &lt;listOfReactions&gt;
         &lt;reaction id='J1'&gt;
             &lt;listOfReactants&gt;
                 &lt;speciesReference species='X0'&gt;
                     &lt;stoichiometryMath&gt;
                         &lt;math xmlns='http://www.w3.org/1998/Math/MathML'&gt; 
                             &lt;cn type='rational'&gt; 3 &lt;sep/&gt; 2 &lt;/cn&gt;
                         &lt;/math&gt;
                     &lt;/stoichiometryMath&gt;
                 &lt;/speciesReference&gt;
             &lt;/listOfReactants&gt;
             ...
         &lt;/reaction&gt;
         ...
     &lt;/listOfReactions&gt;
     ...
 &lt;/model&gt;
 </pre>
 <p>
 * Additional discussions of stoichiometries and implications for species
 * and reactions are included in the documentation of {@link SpeciesReference}
 * class.
 <p>
 * <h2>Stoichiometries in SBML Level 3</h2>
 <p>
 * The {@link StoichiometryMath} construct is not defined in SBML Level&nbsp;3.
 * Instead, Level&nbsp;3 defines the identifier of
 * {@link SpeciesReference} objects as a stand-in for the stoichiometry of the
 * reactant or product being referenced, and allows that identifier to be
 * used elsewhere in SBML models, including (for example) {@link InitialAssignment}
 * objects.  This makes it possible to achieve the same effect as
 * {@link StoichiometryMath}, but with other SBML objects.  For instance, to
 * produce a stoichiometry value that is a rational number, a model can use
 * {@link InitialAssignment} to assign the identifier of a {@link SpeciesReference} object
 * to a MathML expression evaluating to a rational number.  This is
 * analogous to the same way that, in Level&nbsp;2, the model would use
 * {@link StoichiometryMath} with a MathML expression evaluating to a rational
 * number.
 <p>
 * In SBML Level 2, the stoichiometry of a reactant or product is a
 * combination of both a <em>biochemical stoichiometry</em> (meaning, the
 * standard stoichiometry of a species in a reaction) and any necessary
 * unit conversion factors. The introduction of an explicit attribute on
 * the {@link Species} object for a conversion factor allows Level&nbsp;3 to avoid
 * having to overload the meaning of stoichiometry.  In Level&nbsp;3, the
 * stoichiometry given by a {@link SpeciesReference} object in a reaction is a
 * 'proper' biochemical stoichiometry, meaning a dimensionless number free
 * of unit conversions.
 <p>
 * @see SpeciesReference
 * @see Reaction
 */

public class StoichiometryMath extends SBase {
   private long swigCPtr;

   protected StoichiometryMath(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.StoichiometryMath_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(StoichiometryMath obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (StoichiometryMath obj)
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
        libsbmlJNI.delete_StoichiometryMath(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link StoichiometryMath} object using the given SBML <code>level</code>
   * values.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link StoichiometryMath}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link StoichiometryMath}.
   <p>
   * <p>
 * @throws SBMLConstructorException
 * Thrown if the given <code>level</code> and <code>version</code> combination are invalid
 * or if this object is incompatible with the given level and version.
   <p>
   * <p>
 * @note The {@link StoichiometryMath} construct exists only in SBML Level&nbsp;2.
 * It is an optional construct available for defining the stoichiometries of
 * reactants and products in {@link Reaction} objects.  Note that a different
 * mechanism is used in SBML Level&nbsp;3, where {@link StoichiometryMath} is not
 * available.  Please consult the top of this libSBML {@link StoichiometryMath}
 * documentation for more information about the differences between SBML
 * Level&nbsp;2 and&nbsp;3 with respect to stoichiometries.
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
 * particular value to an attribute.
   */ public
 StoichiometryMath(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_StoichiometryMath__SWIG_0(level, version), true);
  }

  
/**
   * Creates a new {@link StoichiometryMath} object using the given {@link SBMLNamespaces} object
   * <code>sbmlns</code>.
   <p>
   * <p>
 * The {@link SBMLNamespaces} object encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and (in
 * Level&nbsp;3) packages used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * {@link SBMLNamespaces} object somewhere in a program once, then hand that object
 * as needed to object constructors that accept {@link SBMLNamespaces} as arguments. 
   <p>
   * @param sbmlns an {@link SBMLNamespaces} object.
   <p>
   * <p>
 * @throws SBMLConstructorException
 * Thrown if the given <code>sbmlns</code> is inconsistent or incompatible
 * with this object.
   <p>
   * <p>
 * @note The {@link StoichiometryMath} construct exists only in SBML Level&nbsp;2.
 * It is an optional construct available for defining the stoichiometries of
 * reactants and products in {@link Reaction} objects.  Note that a different
 * mechanism is used in SBML Level&nbsp;3, where {@link StoichiometryMath} is not
 * available.  Please consult the top of this libSBML {@link StoichiometryMath}
 * documentation for more information about the differences between SBML
 * Level&nbsp;2 and&nbsp;3 with respect to stoichiometries.
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
 * particular value to an attribute.
   */ public
 StoichiometryMath(SBMLNamespaces sbmlns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_StoichiometryMath__SWIG_1(SBMLNamespaces.getCPtr(sbmlns), sbmlns), true);
  }

  
/**
   * Copy constructor; creates a copy of this {@link StoichiometryMath}.
   <p>
   * @param orig the object to copy.
   */ public
 StoichiometryMath(StoichiometryMath orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_StoichiometryMath__SWIG_2(StoichiometryMath.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link StoichiometryMath} object.
   <p>
   * @return the (deep) copy of this {@link StoichiometryMath} object.
   */ public
 StoichiometryMath cloneObject() {
    long cPtr = libsbmlJNI.StoichiometryMath_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new StoichiometryMath(cPtr, true);
  }

  
/**
   * Retrieves the mathematical formula within this {@link StoichiometryMath} and
   * return it as an AST.
   <p>
   * @return the math of this {@link StoichiometryMath}, or <code>null</code> if the math is not set.
   <p>
   * <p>
 * @note The {@link StoichiometryMath} construct exists only in SBML Level&nbsp;2.
 * It is an optional construct available for defining the stoichiometries of
 * reactants and products in {@link Reaction} objects.  Note that a different
 * mechanism is used in SBML Level&nbsp;3, where {@link StoichiometryMath} is not
 * available.  Please consult the top of this libSBML {@link StoichiometryMath}
 * documentation for more information about the differences between SBML
 * Level&nbsp;2 and&nbsp;3 with respect to stoichiometries.
   */ public
 ASTNode getMath() {
    long cPtr = libsbmlJNI.StoichiometryMath_getMath(swigCPtr, this);
    return (cPtr == 0) ? null : new ASTNode(cPtr, false);
  }

  
/**
   * Predicate to test whether the math for this {@link StoichiometryMath} object
   * is set.
   <p>
   * @return <code>true</code> if the formula (meaning the <code>math</code> subelement) of
   * this {@link StoichiometryMath} is set, <code>false</code> otherwise.
   <p>
   * <p>
 * @note The {@link StoichiometryMath} construct exists only in SBML Level&nbsp;2.
 * It is an optional construct available for defining the stoichiometries of
 * reactants and products in {@link Reaction} objects.  Note that a different
 * mechanism is used in SBML Level&nbsp;3, where {@link StoichiometryMath} is not
 * available.  Please consult the top of this libSBML {@link StoichiometryMath}
 * documentation for more information about the differences between SBML
 * Level&nbsp;2 and&nbsp;3 with respect to stoichiometries.
   */ public
 boolean isSetMath() {
    return libsbmlJNI.StoichiometryMath_isSetMath(swigCPtr, this);
  }

  
/**
   * Sets the 'math' expression of this {@link StoichiometryMath} instance to a
   * copy of the given {@link ASTNode}.
   <p>
   * @param math an {@link ASTNode} representing a formula tree.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   *
   * </ul> <p>
   * <p>
 * @note The {@link StoichiometryMath} construct exists only in SBML Level&nbsp;2.
 * It is an optional construct available for defining the stoichiometries of
 * reactants and products in {@link Reaction} objects.  Note that a different
 * mechanism is used in SBML Level&nbsp;3, where {@link StoichiometryMath} is not
 * available.  Please consult the top of this libSBML {@link StoichiometryMath}
 * documentation for more information about the differences between SBML
 * Level&nbsp;2 and&nbsp;3 with respect to stoichiometries.
   */ public
 int setMath(ASTNode math) {
    return libsbmlJNI.StoichiometryMath_setMath(swigCPtr, this, ASTNode.getCPtr(math), math);
  }

  
/**
   * Calculates and returns a {@link UnitDefinition} object that expresses the
   * units returned by the math expression in this {@link StoichiometryMath}
   * object.
   <p>
   * The units are calculated based on the mathematical expression in the
   * {@link StoichiometryMath} and the model quantities referenced by
   * <code>&lt;ci&gt;</code> elements used within that expression.  The
   * {@link StoichiometryMath#getDerivedUnitDefinition()} method returns the
   * calculated units.
   <p>
   * Note that the functionality that facilitates unit analysis depends 
   * on the model as a whole.  Thus, in cases where the object has not 
   * been added to a model or the model itself is incomplete,
   * unit analysis is not possible and this method will return <code>null.</code>
   <p>
   * @return a {@link UnitDefinition} that expresses the units of the math, 
   * or <code>null</code> if one cannot be constructed.
   <p>
   * @warning <span class='warning'>Note that it is possible the 'math'
   * expression in the {@link StoichiometryMath} instance contains literal numbers or
   * parameters with undeclared units.  In those cases, it is not possible to
   * calculate the units of the overall expression without making
   * assumptions.  LibSBML does not make assumptions about the units, and
   * {@link StoichiometryMath#getDerivedUnitDefinition()} only returns the units as
   * far as it is able to determine them.  For example, in an expression
   * <em>X + Y</em>, if <em>X</em> has unambiguously-defined units and
   * <em>Y</em> does not, it will return the units of <em>X</em>.  When using
   * this method, <strong>it is critical that callers also invoke the
   * method</strong> {@link StoichiometryMath#containsUndeclaredUnits()} <strong>to
   * determine whether this situation holds</strong>.  Callers should take
   * suitable action in those situations.</span>
   <p>
   * @see #containsUndeclaredUnits()
   */ public
 UnitDefinition getDerivedUnitDefinition() {
    long cPtr = libsbmlJNI.StoichiometryMath_getDerivedUnitDefinition__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new UnitDefinition(cPtr, false);
  }

  
/**
   * Predicate returning <code>true</code> if the math
   * expression of this {@link StoichiometryMath} object contains literal numbers
   * or parameters with undeclared units.
   <p>
   * The {@link StoichiometryMath#getDerivedUnitDefinition()} method returns what
   * libSBML computes the units of the Stoichiometry to be, to the extent
   * that libSBML can compute them.  However, if the expression contains
   * literal numbers or parameters with undeclared units, libSBML may not
   * be able to compute the full units of the expression and will only
   * return what it can compute.  Callers should always use
   * {@link StoichiometryMath#containsUndeclaredUnits()} when using
   * {@link StoichiometryMath#getDerivedUnitDefinition()} to decide whether the
   * returned units may be incomplete.
   <p>
   * @return <code>true</code> if the math expression of this {@link StoichiometryMath}
   * includes numbers/parameters with undeclared units, <code>false</code> otherwise.
   <p>
   * @note A return value of <code>true</code> indicates that the {@link UnitDefinition}
   * returned by {@link StoichiometryMath#getDerivedUnitDefinition()} may not
   * accurately represent the units of the expression.
   <p>
   * @see #getDerivedUnitDefinition()
   */ public
 boolean containsUndeclaredUnits() {
    return libsbmlJNI.StoichiometryMath_containsUndeclaredUnits__SWIG_0(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code of this object instance.
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
   * {@link libsbmlConstants#SBML_STOICHIOMETRY_MATH SBML_STOICHIOMETRY_MATH} (default).
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
    return libsbmlJNI.StoichiometryMath_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this object, which for {@link StoichiometryMath}, is
   * always <code>'stoichiometryMath'.</code>
   <p>
   * @return the name of this element, i.e., <code>'stoichiometryMath'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.StoichiometryMath_getElementName(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if
   * all the required elements for this {@link StoichiometryMath} object
   * have been set.
   <p>
   * @note The required elements for a {@link StoichiometryMath} object are:
   * <ul>
   * <li> 'math'
   *
   * </ul> <p>
   * @return a boolean value indicating whether all the required
   * elements for this object have been defined.
   */ public
 boolean hasRequiredElements() {
    return libsbmlJNI.StoichiometryMath_hasRequiredElements(swigCPtr, this);
  }

  
/**
   * Finds this {@link StoichiometryMath}'s {@link SpeciesReference} parent and calls
   * unsetStoichiometryMath() on it, indirectly deleting itself.
   <p>
   * Overridden from the {@link SBase} function since the parent is not a {@link ListOf}.
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
 int removeFromParentAndDelete() {
    return libsbmlJNI.StoichiometryMath_removeFromParentAndDelete(swigCPtr, this);
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
    libsbmlJNI.StoichiometryMath_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/**
   * <p>
 * Replaces all uses of a given <code>UnitSIdRef</code> type attribute value with
 * another value.
 <p>
 * <p>
 * In SBML, unit definitions have identifiers of type <code>UnitSId</code>.  In
 * SBML Level&nbsp;3, an explicit data type called <code>UnitSIdRef</code> was
 * introduced for attribute values that refer to <code>UnitSId</code> values; in
 * previous Levels of SBML, this data type did not exist and attributes were
 * simply described to as 'referring to a unit identifier', but the effective
 * data type was the same as <code>UnitSIdRef</code> in Level&nbsp;3.  These and
 * other methods of libSBML refer to the type <code>UnitSIdRef</code> for all
 * Levels of SBML, even if the corresponding SBML specification did not
 * explicitly name the data type.
 <p>
 * This method works by looking at all unit identifier attribute values
 * (including, if appropriate, inside mathematical formulas), comparing the
 * referenced unit identifiers to the value of <code>oldid</code>.  If any matches
 * are found, the matching values are replaced with <code>newid</code>.  The method
 * does <em>not</em> descend into child elements.
 <p>
 * @param oldid the old identifier.
 * @param newid the new identifier.
   */ public
 void renameUnitSIdRefs(String oldid, String newid) {
    libsbmlJNI.StoichiometryMath_renameUnitSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/** * @internal */ public
 void replaceSIDWithFunction(String id, ASTNode function) {
    libsbmlJNI.StoichiometryMath_replaceSIDWithFunction(swigCPtr, this, id, ASTNode.getCPtr(function), function);
  }

}
