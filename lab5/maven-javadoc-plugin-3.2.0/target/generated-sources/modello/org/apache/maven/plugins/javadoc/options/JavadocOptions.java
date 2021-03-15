// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.plugins.javadoc.options;

/**
 * Root class to contain all javadoc configuration options for
 * inclusion in javadoc bundle archives.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class JavadocOptions
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field groups.
     */
    private java.util.List<Group> groups;

    /**
     * Field tags.
     */
    private java.util.List<Tag> tags;

    /**
     * Field docletArtifacts.
     */
    private java.util.List<DocletArtifact> docletArtifacts;

    /**
     * Field taglets.
     */
    private java.util.List<Taglet> taglets;

    /**
     * Field offlineLinks.
     */
    private java.util.List<OfflineLink> offlineLinks;

    /**
     * Field tagletArtifacts.
     */
    private java.util.List<TagletArtifact> tagletArtifacts;

    /**
     * Field resourcesArtifacts.
     */
    private java.util.List<ResourcesArtifact> resourcesArtifacts;

    /**
     * Field bootclasspathArtifacts.
     */
    private java.util.List<BootclasspathArtifact> bootclasspathArtifacts;

    /**
     * Field links.
     */
    private java.util.List<String> links;

    /**
     * Field excludePackageNames.
     */
    private java.util.List<String> excludePackageNames;

    /**
     * Enables deep copying of the '&#42;&#42;/doc-files'
     * directories and the specific 'resources' directory.
     */
    private boolean docfilesSubdirsUsed = false;

    /**
     * List of exclusion patterns separated by ':' for deep copying
     * of the '&#42;&#42;/doc-files' directories.
     */
    private String excludedDocfilesSubdirs;

    /**
     * 
     *             Path relative to project basedir where javadoc
     * resources were located. 
     *             This is mainly useful in multimodule builds
     * where the reactor is still populated.
     *           
     */
    private String javadocResourcesDirectory;

    /**
     * Field modelEncoding.
     */
    private String modelEncoding = "UTF-8";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addBootclasspathArtifact.
     * 
     * @param bootclasspathArtifact
     */
    public void addBootclasspathArtifact( BootclasspathArtifact bootclasspathArtifact )
    {
        getBootclasspathArtifacts().add( bootclasspathArtifact );
    } //-- void addBootclasspathArtifact( BootclasspathArtifact )

    /**
     * Method addDocletArtifact.
     * 
     * @param docletArtifact
     */
    public void addDocletArtifact( DocletArtifact docletArtifact )
    {
        getDocletArtifacts().add( docletArtifact );
    } //-- void addDocletArtifact( DocletArtifact )

    /**
     * Method addExcludePackageName.
     * 
     * @param string
     */
    public void addExcludePackageName( String string )
    {
        getExcludePackageNames().add( string );
    } //-- void addExcludePackageName( String )

    /**
     * Method addGroup.
     * 
     * @param group
     */
    public void addGroup( Group group )
    {
        getGroups().add( group );
    } //-- void addGroup( Group )

    /**
     * Method addLink.
     * 
     * @param string
     */
    public void addLink( String string )
    {
        getLinks().add( string );
    } //-- void addLink( String )

    /**
     * Method addOfflineLink.
     * 
     * @param offlineLink
     */
    public void addOfflineLink( OfflineLink offlineLink )
    {
        getOfflineLinks().add( offlineLink );
    } //-- void addOfflineLink( OfflineLink )

    /**
     * Method addResourcesArtifact.
     * 
     * @param resourcesArtifact
     */
    public void addResourcesArtifact( ResourcesArtifact resourcesArtifact )
    {
        getResourcesArtifacts().add( resourcesArtifact );
    } //-- void addResourcesArtifact( ResourcesArtifact )

    /**
     * Method addTag.
     * 
     * @param tag
     */
    public void addTag( Tag tag )
    {
        getTags().add( tag );
    } //-- void addTag( Tag )

    /**
     * Method addTaglet.
     * 
     * @param taglet
     */
    public void addTaglet( Taglet taglet )
    {
        getTaglets().add( taglet );
    } //-- void addTaglet( Taglet )

    /**
     * Method addTagletArtifact.
     * 
     * @param tagletArtifact
     */
    public void addTagletArtifact( TagletArtifact tagletArtifact )
    {
        getTagletArtifacts().add( tagletArtifact );
    } //-- void addTagletArtifact( TagletArtifact )

    /**
     * Method getBootclasspathArtifacts.
     * 
     * @return List
     */
    public java.util.List<BootclasspathArtifact> getBootclasspathArtifacts()
    {
        if ( this.bootclasspathArtifacts == null )
        {
            this.bootclasspathArtifacts = new java.util.ArrayList<BootclasspathArtifact>();
        }

        return this.bootclasspathArtifacts;
    } //-- java.util.List<BootclasspathArtifact> getBootclasspathArtifacts()

    /**
     * Method getDocletArtifacts.
     * 
     * @return List
     */
    public java.util.List<DocletArtifact> getDocletArtifacts()
    {
        if ( this.docletArtifacts == null )
        {
            this.docletArtifacts = new java.util.ArrayList<DocletArtifact>();
        }

        return this.docletArtifacts;
    } //-- java.util.List<DocletArtifact> getDocletArtifacts()

    /**
     * Method getExcludePackageNames.
     * 
     * @return List
     */
    public java.util.List<String> getExcludePackageNames()
    {
        if ( this.excludePackageNames == null )
        {
            this.excludePackageNames = new java.util.ArrayList<String>();
        }

        return this.excludePackageNames;
    } //-- java.util.List<String> getExcludePackageNames()

    /**
     * Get list of exclusion patterns separated by ':' for deep
     * copying of the '&#42;&#42;/doc-files' directories.
     * 
     * @return String
     */
    public String getExcludedDocfilesSubdirs()
    {
        return this.excludedDocfilesSubdirs;
    } //-- String getExcludedDocfilesSubdirs()

    /**
     * Method getGroups.
     * 
     * @return List
     */
    public java.util.List<Group> getGroups()
    {
        if ( this.groups == null )
        {
            this.groups = new java.util.ArrayList<Group>();
        }

        return this.groups;
    } //-- java.util.List<Group> getGroups()

    /**
     * Get path relative to project basedir where javadoc resources
     * were located. 
     *             This is mainly useful in multimodule builds
     * where the reactor is still populated.
     * 
     * @return String
     */
    public String getJavadocResourcesDirectory()
    {
        return this.javadocResourcesDirectory;
    } //-- String getJavadocResourcesDirectory()

    /**
     * Method getLinks.
     * 
     * @return List
     */
    public java.util.List<String> getLinks()
    {
        if ( this.links == null )
        {
            this.links = new java.util.ArrayList<String>();
        }

        return this.links;
    } //-- java.util.List<String> getLinks()

    /**
     * Get the modelEncoding field.
     * 
     * @return String
     */
    public String getModelEncoding()
    {
        return this.modelEncoding;
    } //-- String getModelEncoding()

    /**
     * Method getOfflineLinks.
     * 
     * @return List
     */
    public java.util.List<OfflineLink> getOfflineLinks()
    {
        if ( this.offlineLinks == null )
        {
            this.offlineLinks = new java.util.ArrayList<OfflineLink>();
        }

        return this.offlineLinks;
    } //-- java.util.List<OfflineLink> getOfflineLinks()

    /**
     * Method getResourcesArtifacts.
     * 
     * @return List
     */
    public java.util.List<ResourcesArtifact> getResourcesArtifacts()
    {
        if ( this.resourcesArtifacts == null )
        {
            this.resourcesArtifacts = new java.util.ArrayList<ResourcesArtifact>();
        }

        return this.resourcesArtifacts;
    } //-- java.util.List<ResourcesArtifact> getResourcesArtifacts()

    /**
     * Method getTagletArtifacts.
     * 
     * @return List
     */
    public java.util.List<TagletArtifact> getTagletArtifacts()
    {
        if ( this.tagletArtifacts == null )
        {
            this.tagletArtifacts = new java.util.ArrayList<TagletArtifact>();
        }

        return this.tagletArtifacts;
    } //-- java.util.List<TagletArtifact> getTagletArtifacts()

    /**
     * Method getTaglets.
     * 
     * @return List
     */
    public java.util.List<Taglet> getTaglets()
    {
        if ( this.taglets == null )
        {
            this.taglets = new java.util.ArrayList<Taglet>();
        }

        return this.taglets;
    } //-- java.util.List<Taglet> getTaglets()

    /**
     * Method getTags.
     * 
     * @return List
     */
    public java.util.List<Tag> getTags()
    {
        if ( this.tags == null )
        {
            this.tags = new java.util.ArrayList<Tag>();
        }

        return this.tags;
    } //-- java.util.List<Tag> getTags()

    /**
     * Get enables deep copying of the '&#42;&#42;/doc-files'
     * directories and the specific 'resources' directory.
     * 
     * @return boolean
     */
    public boolean isDocfilesSubdirsUsed()
    {
        return this.docfilesSubdirsUsed;
    } //-- boolean isDocfilesSubdirsUsed()

    /**
     * Method removeBootclasspathArtifact.
     * 
     * @param bootclasspathArtifact
     */
    public void removeBootclasspathArtifact( BootclasspathArtifact bootclasspathArtifact )
    {
        getBootclasspathArtifacts().remove( bootclasspathArtifact );
    } //-- void removeBootclasspathArtifact( BootclasspathArtifact )

    /**
     * Method removeDocletArtifact.
     * 
     * @param docletArtifact
     */
    public void removeDocletArtifact( DocletArtifact docletArtifact )
    {
        getDocletArtifacts().remove( docletArtifact );
    } //-- void removeDocletArtifact( DocletArtifact )

    /**
     * Method removeExcludePackageName.
     * 
     * @param string
     */
    public void removeExcludePackageName( String string )
    {
        getExcludePackageNames().remove( string );
    } //-- void removeExcludePackageName( String )

    /**
     * Method removeGroup.
     * 
     * @param group
     */
    public void removeGroup( Group group )
    {
        getGroups().remove( group );
    } //-- void removeGroup( Group )

    /**
     * Method removeLink.
     * 
     * @param string
     */
    public void removeLink( String string )
    {
        getLinks().remove( string );
    } //-- void removeLink( String )

    /**
     * Method removeOfflineLink.
     * 
     * @param offlineLink
     */
    public void removeOfflineLink( OfflineLink offlineLink )
    {
        getOfflineLinks().remove( offlineLink );
    } //-- void removeOfflineLink( OfflineLink )

    /**
     * Method removeResourcesArtifact.
     * 
     * @param resourcesArtifact
     */
    public void removeResourcesArtifact( ResourcesArtifact resourcesArtifact )
    {
        getResourcesArtifacts().remove( resourcesArtifact );
    } //-- void removeResourcesArtifact( ResourcesArtifact )

    /**
     * Method removeTag.
     * 
     * @param tag
     */
    public void removeTag( Tag tag )
    {
        getTags().remove( tag );
    } //-- void removeTag( Tag )

    /**
     * Method removeTaglet.
     * 
     * @param taglet
     */
    public void removeTaglet( Taglet taglet )
    {
        getTaglets().remove( taglet );
    } //-- void removeTaglet( Taglet )

    /**
     * Method removeTagletArtifact.
     * 
     * @param tagletArtifact
     */
    public void removeTagletArtifact( TagletArtifact tagletArtifact )
    {
        getTagletArtifacts().remove( tagletArtifact );
    } //-- void removeTagletArtifact( TagletArtifact )

    /**
     * Set a list of BootclasspathArtifact parameters.
     * 
     * @param bootclasspathArtifacts
     */
    public void setBootclasspathArtifacts( java.util.List<BootclasspathArtifact> bootclasspathArtifacts )
    {
        this.bootclasspathArtifacts = bootclasspathArtifacts;
    } //-- void setBootclasspathArtifacts( java.util.List )

    /**
     * Set enables deep copying of the '&#42;&#42;/doc-files'
     * directories and the specific 'resources' directory.
     * 
     * @param docfilesSubdirsUsed
     */
    public void setDocfilesSubdirsUsed( boolean docfilesSubdirsUsed )
    {
        this.docfilesSubdirsUsed = docfilesSubdirsUsed;
    } //-- void setDocfilesSubdirsUsed( boolean )

    /**
     * Set a list of DocletArtifact parameters.
     * 
     * @param docletArtifacts
     */
    public void setDocletArtifacts( java.util.List<DocletArtifact> docletArtifacts )
    {
        this.docletArtifacts = docletArtifacts;
    } //-- void setDocletArtifacts( java.util.List )

    /**
     * Set list of subpackage patterns to exclude from javadoc
     * generation.
     * 
     * @param excludePackageNames
     */
    public void setExcludePackageNames( java.util.List<String> excludePackageNames )
    {
        this.excludePackageNames = excludePackageNames;
    } //-- void setExcludePackageNames( java.util.List )

    /**
     * Set list of exclusion patterns separated by ':' for deep
     * copying of the '&#42;&#42;/doc-files' directories.
     * 
     * @param excludedDocfilesSubdirs
     */
    public void setExcludedDocfilesSubdirs( String excludedDocfilesSubdirs )
    {
        this.excludedDocfilesSubdirs = excludedDocfilesSubdirs;
    } //-- void setExcludedDocfilesSubdirs( String )

    /**
     * Set a list of Group parameters.
     * 
     * @param groups
     */
    public void setGroups( java.util.List<Group> groups )
    {
        this.groups = groups;
    } //-- void setGroups( java.util.List )

    /**
     * Set path relative to project basedir where javadoc resources
     * were located. 
     *             This is mainly useful in multimodule builds
     * where the reactor is still populated.
     * 
     * @param javadocResourcesDirectory
     */
    public void setJavadocResourcesDirectory( String javadocResourcesDirectory )
    {
        this.javadocResourcesDirectory = javadocResourcesDirectory;
    } //-- void setJavadocResourcesDirectory( String )

    /**
     * Set list of URLs to javadocs for external classes.
     * 
     * @param links
     */
    public void setLinks( java.util.List<String> links )
    {
        this.links = links;
    } //-- void setLinks( java.util.List )

    /**
     * Set the modelEncoding field.
     * 
     * @param modelEncoding
     */
    public void setModelEncoding( String modelEncoding )
    {
        this.modelEncoding = modelEncoding;
    } //-- void setModelEncoding( String )

    /**
     * Set a list of OfflineLink parameters.
     * 
     * @param offlineLinks
     */
    public void setOfflineLinks( java.util.List<OfflineLink> offlineLinks )
    {
        this.offlineLinks = offlineLinks;
    } //-- void setOfflineLinks( java.util.List )

    /**
     * Set a list of ResourcesArtifact parameters.
     * 
     * @param resourcesArtifacts
     */
    public void setResourcesArtifacts( java.util.List<ResourcesArtifact> resourcesArtifacts )
    {
        this.resourcesArtifacts = resourcesArtifacts;
    } //-- void setResourcesArtifacts( java.util.List )

    /**
     * Set a list of TagletArtifact parameters.
     * 
     * @param tagletArtifacts
     */
    public void setTagletArtifacts( java.util.List<TagletArtifact> tagletArtifacts )
    {
        this.tagletArtifacts = tagletArtifacts;
    } //-- void setTagletArtifacts( java.util.List )

    /**
     * Set a list of Taglet parameters.
     * 
     * @param taglets
     */
    public void setTaglets( java.util.List<Taglet> taglets )
    {
        this.taglets = taglets;
    } //-- void setTaglets( java.util.List )

    /**
     * Set a list of Tag parameters.
     * 
     * @param tags
     */
    public void setTags( java.util.List<Tag> tags )
    {
        this.tags = tags;
    } //-- void setTags( java.util.List )

}
