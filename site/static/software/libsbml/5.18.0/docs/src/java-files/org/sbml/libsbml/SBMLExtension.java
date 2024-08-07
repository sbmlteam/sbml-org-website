/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Base class for SBML Level 3 package plug-ins.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 <p>
 * The {@link SBMLExtension} class is a component of the libSBML package extension
 * mechanism.  It is an abstract class that is extended by each package
 * extension implementation. 
 <p>
 * <p>
 * <h2>Basic principles of SBML package extensions in libSBML</h2>
 <p>
 * SBML Level&nbsp;3's package structure permits modular extensions to the
 * core SBML format.  In libSBML, support for SBML Level&nbsp;3 packages is
 * provided through optional <em>package extensions</em> that can be plugged
 * into libSBML at the time it is built/compiled.  Users of libSBML can thus
 * choose which extensions are enabled in their software applications.
 <p>
 * LibSBML defines a number of classes that developers of package extensions
 * can use to implement support for an SBML Level&nbsp;3 package.  These
 * classes make it easier to extend libSBML objects with new attributes
 * and/or subobjects as needed by a particular Level&nbsp;3 package.
 * Three overall categories of classes make up libSBML's facilities for
 * implementing package extensions.  There are (1) classes that serve as base
 * classes meant to be subclassed, (2) template classes meant to be
 * instantiated rather than subclassed, and (3) support classes that provide
 * utility features. A given package implementation for libSBML will take
 * the form of code using these and other libSBML classes, placed in a
 * subdirectory of <code>src/sbml/packages/</code>.
 <p>
 * The basic libSBML distribution includes a number of package extensions
 * implementing support for officially-endorsed SBML Level&nbsp;3 packages;
 * among these are <em>Flux Balance Constraints</em> ('fbc'),
 * <em>Hierarchical Model Composition</em> ('comp'), <em>Layout</em>
 * ('layout'), and <em>Qualitative Models</em> ('qual').  They can serve as
 * working examples for developers working to implement other packages.
 <p>
 * Extensions in libSBML can currently only be implemented in C++ or C;
 * there is no mechanism to implement them first in languages such as
 * Java or Python.  However, once implemented in C++ or C, language
 * interfaces can be generated semi-automatically using the framework in
 * place in libSBML.  (The approach is based on using <a target='_blank'
 * href='http://www.swig.org'>SWIG</a> and facilities in libSBML's build
 * system.)
 <p>
 * <h2>Special handling for SBML Level&nbsp;2</h2>
 * <p>
 * Due to the historical background of the SBML Layout package, libSBML
 * implements special behavior for that package: it <em>always</em> creates a
 * Layout plugin object for any SBML Level&nbsp;2 document it reads in,
 * regardless of whether that document actually uses Layout constructs.  This
 * is unlike the case for SBML Level&nbsp;3 documents that use Layout; for
 * them, libSBML will <em>not</em> create a plugin object unless the document
 * actually declares the use of the Layout package (via the usual Level&nbsp;3
 * namespace declaration for Level&nbsp;3 packages).
 <p>
 * This has the following consequence.  If an application queries for the
 * presence of Layout in an SBML Level&nbsp;2 document by testing only for
 * the existence of the plugin object, <strong>it will always get a positive
 * result</strong>; in other words, the presence of a Layout extension
 * object is not an indication of whether a read-in Level&nbsp;2 document
 * does or does not use SBML Layout.  Instead, callers have to query
 * explicitly for the existence of layout information.  An example of such a
 * query is the following code:
 <p>
<pre class='fragment'>
// Assume 'doc' below is an {@link SBMLDocument} object.
{@link Model} m = doc.getModel();
{@link LayoutModelPlugin} lmp = (LayoutModelPlugin) m.getPlugin('layout');
if (lmp != null)
{
  int numLayouts = lmp.getNumLayouts();
  // If numLayouts is greater than zero, then the model uses {@link Layout}.
}
</pre>
<p>
 * The special, always-available Level&nbsp;2 Layout behavior was motivated
 * by a desire to support legacy applications.  In SBML Level&nbsp;3, the
 * Layout package uses the normal SBML Level&nbsp;3 scheme of requiring
 * declarations on the SBML document element.  This means that upon reading a
 * model, libSBML knows right away whether it contains layout information.
 * In SBML Level&nbsp;2, there is no top-level declaration because layout is
 * stored as annotations in the body of the model.  Detecting the presence of
 * layout information when reading a Level&nbsp;2 model requires parsing the
 * annotations.  For efficiency reasons, libSBML normally does not parse
 * annotations automatically when reading a model.  However, applications
 * that predated the introduction of Level&nbsp;3 Layout and the updated
 * version of libSBML never had to do anything special to enable parsing
 * layout; the facilities were always available for every Level&nbsp;2 model
 * as long as libSBML was compiled with Layout support.  To avoid burdening
 * developers of legacy applications with the need to modify their software,
 * libSBML provides backward compatibility by always preloading the Layout
 * package extension when reading Level&nbsp;2 models.  The same applies to
 * the creation of Level&nbsp;2 models: with the plugin-oriented libSBML,
 * applications normally would have to take deliberate steps to activate
 * package code, instantiate objects, manage namespaces, and so on.  LibSBML
 * again loads the Layout package plugin automatically when creating a
 * Level&nbsp;2 model, thereby making the APIs available to legacy
 * applications without further work on their part.
 */

public class SBMLExtension {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected SBMLExtension(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(SBMLExtension obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLExtension obj)
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
        libsbmlJNI.delete_SBMLExtension(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * SBMLExtension derived classes must override this method
   * @internal
   */
  public SBasePlugin DowncastSBasePlugin(long cPtr, boolean owner)
  {
    if (cPtr == 0) return null;

    return new SBasePlugin(cPtr,false);
  }


  /**
   * SBMLExtension derived classes must override this method
   * @internal
   */
  public SBase DowncastSBase(long cPtr, boolean owner)
  {
    if (cPtr == 0) return null;

    return new SBase(cPtr, owner);
  }

  
/**
   * Returns the number of SBasePluginCreatorBase objects stored in this
   * object.
   <p>
   * @return the total number of SBasePluginCreatorBase objects stored in
   * this {@link SBMLExtension}-derived object.
   */ public
 int getNumOfSBasePlugins() {
    return libsbmlJNI.SBMLExtension_getNumOfSBasePlugins(swigCPtr, this);
  }

  
/**
   * Returns the number of supported package namespace URIs.
   <p>
   * @return the number of supported package XML namespace URIs of this
   * package extension.
   */ public
 long getNumOfSupportedPackageURI() {
    return libsbmlJNI.SBMLExtension_getNumOfSupportedPackageURI(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if the given XML namespace URI is supported by this
   * package extension.
   <p>
   * @return <code>true</code> if the given XML namespace URI (equivalent to a package
   * version) is supported by this package extension, <code>false</code> otherwise.
   */ public
 boolean isSupported(String uri) {
    return libsbmlJNI.SBMLExtension_isSupported(swigCPtr, this, uri);
  }

  
/**
   * Returns the nth XML namespace URI.
   <p>
   * @param n the index number of the namespace URI being sought.
<p>
   * @return a string representing the XML namespace URI understood to be
   * supported by this package.  An empty string will be returned if there is
   * no nth URI.
   */ public
 String getSupportedPackageURI(long n) {
    return libsbmlJNI.SBMLExtension_getSupportedPackageURI(swigCPtr, this, n);
  }

  
/**
   * Creates and returns a deep copy of this {@link SBMLExtension} object.
   <p>
   * @return a (deep) copy of this {@link SBMLExtension} object.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 SBMLExtension cloneObject() {
	return libsbml.DowncastExtension(libsbmlJNI.SBMLExtension_cloneObject(swigCPtr, this), true);
}

  
/**
   * Returns the nickname of this package.
   <p>
   * This returns the short-form name of an SBML Level&nbsp;3 package
   * implemented by a given {@link SBMLExtension}-derived class.  Examples of
   * such names are 'layout', 'fbc', etc.
   <p>
   * @return a string, the nickname of SBML package.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 String getName() {
    return libsbmlJNI.SBMLExtension_getName(swigCPtr, this);
  }

  
/**
   * Returns the XML namespace URI for a given Level and Version.
   <p>
   * @param sbmlLevel the SBML Level.
   * @param sbmlVersion the SBML Version.
   * @param pkgVersion the version of the package.
   <p>
   * @return a string, the XML namespace URI for the package for the given
   * SBML Level, SBML Version, and package version.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 String getURI(long sbmlLevel, long sbmlVersion, long pkgVersion) {
    return libsbmlJNI.SBMLExtension_getURI(swigCPtr, this, sbmlLevel, sbmlVersion, pkgVersion);
  }

  
/**
   * Returns the SBML Level associated with the given XML namespace URI.
   <p>
   * @param uri the string of URI that represents a version of the package.
   <p>
   * @return the SBML Level associated with the given URI of this package.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 long getLevel(String uri) {
    return libsbmlJNI.SBMLExtension_getLevel(swigCPtr, this, uri);
  }

  
/**
   * Returns the SBML Version associated with the given XML namespace URI.
   <p>
   * @param uri the string of URI that represents a version of the package.
   <p>
   * @return the SBML Version associated with the given URI of this package.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 long getVersion(String uri) {
    return libsbmlJNI.SBMLExtension_getVersion(swigCPtr, this, uri);
  }

  
/**
   * Returns the package version associated with the given XML namespace URI.
   <p>
   * @param uri the string of URI that represents a version of this package.
   <p>
   * @return the package version associated with the given URI of this package.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 long getPackageVersion(String uri) {
    return libsbmlJNI.SBMLExtension_getPackageVersion(swigCPtr, this, uri);
  }

  
/**
   * Returns a string representation of a type code.
   <p>
   * This method takes a numerical type code <code>typeCode</code> for a component
   * object implemented by this package extension, and returns a string
   * representing that type code.
   <p>
   * @param typeCode the type code to turn into a string.
   <p>
   * @return the string representation of <code>typeCode</code>.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 String getStringFromTypeCode(int typeCode) {
    return libsbmlJNI.SBMLExtension_getStringFromTypeCode(swigCPtr, this, typeCode);
  }

  
/**
   * Returns a specialized {@link SBMLNamespaces} object corresponding to a given
   * namespace URI.
   <p>
   * LibSBML package extensions each define a subclass of
   * {@link SBMLNamespaces}.
   <p>
   * The present method returns the appropriate object corresponding
   * to the given XML namespace URI in argument <code>uri</code>.
   <p>
   * @param uri the namespace URI that represents one of versions of the
   * package implemented in this extension.
   <p>
   * @return an {@link SBMLNamespaces}  
   * object, or <code>null</code> if the given <code>uri</code> is not defined in the
   * corresponding package.
   <p>
   * <p>
 * @note
 * This is a method that package extension implementations must override.
 * See the libSBML documentation on extending libSBML to support SBML
 * packages for more information on this topic.
   */ public
 SBMLNamespaces getSBMLExtensionNamespaces(String uri) {
  return libsbml.DowncastSBMLNamespaces(libsbmlJNI.SBMLExtension_getSBMLExtensionNamespaces(swigCPtr, this, uri), false);
}

  
/**
   * Enable or disable this package.
   <p>
   * @param isEnabled flag indicating whether to enable (if <code>true</code>) or
   * disable (<code>false</code>) this package extension.
   <p>
   * @return <code>true</code> if this call succeeded; <code>false</code> otherwise.
   */ public
 boolean setEnabled(boolean isEnabled) {
    return libsbmlJNI.SBMLExtension_setEnabled(swigCPtr, this, isEnabled);
  }

  
/**
   * Returns <code>true</code> if this package is enabled.
   <p>
   * @return <code>true</code> if this package is enabled, <code>false</code> otherwise.
   */ public
 boolean isEnabled() {
    return libsbmlJNI.SBMLExtension_isEnabled(swigCPtr, this);
  }

  
/**
   * Removes the package's Level&nbsp;2 namespace(s).
   <p>
   * @internal 
   <p>
   * <p>
 * This method is related to special facilities designed to support
 * legacy behaviors surrounding SBML Level&nbsp;2 models.  Due to the
 * historical background of the SBML Layout package, libSBML implements
 * special behavior for that package: it <em>always</em> creates a Layout
 * plugin object for any SBML Level&nbsp;2 document it reads in,
 * regardless of whether that document actually uses Layout constructs.
 * Since Level&nbsp;2 does not use namespaces on the top level of the
 * SBML document object, libSBML simply keys off the fact that the model
 * is a Level&nbsp;2 model.  To allow the extensions for the Layout and
 * Render (and possibly other) packages to support this behavior, the
 * {@link SBMLExtension} class contains special methods to allow packages to
 * hook themselves into the Level&nbsp;2 parsing apparatus when necessary.
   <p>
   * @param xmlns an {@link XMLNamespaces} object that will be used for the annotation.
   * Implementations should override this method with something that removes
   * the package's namespace(s) from the set of namespaces in <code>xmlns</code>.  For
   * instance, here is the code from the Layout package extension:
   * <pre class='fragment'>{.cpp}
for (int n = 0; n &lt; xmlns-&gt;getNumNamespaces(); n++)
{
  if (xmlns-&gt;getURI(n) == {@link LayoutExtension#getXmlnsL2()})
    xmlns-&gt;remove(n);
}
</pre>
   */ public
 void removeL2Namespaces(XMLNamespaces xmlns) {
    libsbmlJNI.SBMLExtension_removeL2Namespaces(swigCPtr, this, XMLNamespaces.getCPtr(xmlns), xmlns);
  }

  
/**
   * Adds the package's Level&nbsp;2 namespace(s).
   <p>
   * @internal 
   <p>
   * <p>
 * This method is related to special facilities designed to support
 * legacy behaviors surrounding SBML Level&nbsp;2 models.  Due to the
 * historical background of the SBML Layout package, libSBML implements
 * special behavior for that package: it <em>always</em> creates a Layout
 * plugin object for any SBML Level&nbsp;2 document it reads in,
 * regardless of whether that document actually uses Layout constructs.
 * Since Level&nbsp;2 does not use namespaces on the top level of the
 * SBML document object, libSBML simply keys off the fact that the model
 * is a Level&nbsp;2 model.  To allow the extensions for the Layout and
 * Render (and possibly other) packages to support this behavior, the
 * {@link SBMLExtension} class contains special methods to allow packages to
 * hook themselves into the Level&nbsp;2 parsing apparatus when necessary.
   <p>
   * @param xmlns an {@link XMLNamespaces} object that will be used for the annotation.
   * Implementation should override this method with something that adds
   * the package's namespace(s) to the set of namespaces in <code>xmlns</code>.  For
   * instance, here is the code from the Layout package extension:
   * <pre class='fragment'>{.cpp}
if (!xmlns-&gt;containsUri( {@link LayoutExtension#getXmlnsL2()}))
  xmlns-&gt;add({@link LayoutExtension#getXmlnsL2()}, 'layout');
</pre>
   */ public
 void addL2Namespaces(XMLNamespaces xmlns) {
    libsbmlJNI.SBMLExtension_addL2Namespaces(swigCPtr, this, XMLNamespaces.getCPtr(xmlns), xmlns);
  }

  
/**
   * Called to enable the package on the {@link SBMLDocument} object.
   <p>
   * @internal 
   <p>
   * <p>
 * This method is related to special facilities designed to support
 * legacy behaviors surrounding SBML Level&nbsp;2 models.  Due to the
 * historical background of the SBML Layout package, libSBML implements
 * special behavior for that package: it <em>always</em> creates a Layout
 * plugin object for any SBML Level&nbsp;2 document it reads in,
 * regardless of whether that document actually uses Layout constructs.
 * Since Level&nbsp;2 does not use namespaces on the top level of the
 * SBML document object, libSBML simply keys off the fact that the model
 * is a Level&nbsp;2 model.  To allow the extensions for the Layout and
 * Render (and possibly other) packages to support this behavior, the
 * {@link SBMLExtension} class contains special methods to allow packages to
 * hook themselves into the Level&nbsp;2 parsing apparatus when necessary.
   <p>
   * @param doc the {@link SBMLDocument} object for the model.
   * Implementations should override this method with something that
   * enables the package based on the package's namespace(s). For example,
   * here is the code from the Layout package extension:
   * <pre class='fragment'>{.cpp}
if (doc-&gt;getLevel() == 2)
  doc-&gt;enablePackage({@link LayoutExtension#getXmlnsL2()}, 'layout', true);
</pre>
   */ public
 void enableL2NamespaceForDocument(SBMLDocument doc) {
    libsbmlJNI.SBMLExtension_enableL2NamespaceForDocument(swigCPtr, this, SBMLDocument.getCPtr(doc), doc);
  }

  
/**
   * Indicates whether this extension is being used by the given {@link SBMLDocument}.
   <p>
   * The default implementation returns <code>true.</code>  This means that when a
   * document had this extension enabled, it will not be possible to convert
   * it to SBML Level&nbsp;2 as we cannot make sure that the extension can be
   * converted.
   <p>
   * @param doc the SBML document to test.
   <p>
   * @return a boolean indicating whether the extension is actually being
   * used by the document.
   */ public
 boolean isInUse(SBMLDocument doc) {
    return libsbmlJNI.SBMLExtension_isInUse(swigCPtr, this, SBMLDocument.getCPtr(doc), doc);
  }

  
/** * @internal */ public
 boolean hasMutiplePackageVersions() {
    return libsbmlJNI.SBMLExtension_hasMutiplePackageVersions(swigCPtr, this);
  }

  
/** * @internal */ public
 long getErrorTableIndex(long errorId) {
    return libsbmlJNI.SBMLExtension_getErrorTableIndex(swigCPtr, this, errorId);
  }

  
/** * @internal */ public
 long getErrorIdOffset() {
    return libsbmlJNI.SBMLExtension_getErrorIdOffset(swigCPtr, this);
  }

  
/** * @internal */ public
 long getSeverity(long index, long pkgVersion) {
    return libsbmlJNI.SBMLExtension_getSeverity(swigCPtr, this, index, pkgVersion);
  }

  
/** * @internal */ public
 long getCategory(long index) {
    return libsbmlJNI.SBMLExtension_getCategory(swigCPtr, this, index);
  }

  
/** * @internal */ public
 String getMessage(long index, long pkgVersion, String details) {
    return libsbmlJNI.SBMLExtension_getMessage(swigCPtr, this, index, pkgVersion, details);
  }

  
/** * @internal */ public
 String getShortMessage(long index) {
    return libsbmlJNI.SBMLExtension_getShortMessage(swigCPtr, this, index);
  }

}
