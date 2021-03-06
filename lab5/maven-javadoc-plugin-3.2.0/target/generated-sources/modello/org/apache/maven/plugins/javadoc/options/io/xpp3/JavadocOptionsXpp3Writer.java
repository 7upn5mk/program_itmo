// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.plugins.javadoc.options.io.xpp3;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.OutputStream;
import java.io.Writer;
import java.util.Iterator;
import org.apache.maven.plugins.javadoc.options.BootclasspathArtifact;
import org.apache.maven.plugins.javadoc.options.DocletArtifact;
import org.apache.maven.plugins.javadoc.options.Group;
import org.apache.maven.plugins.javadoc.options.JavadocOptions;
import org.apache.maven.plugins.javadoc.options.JavadocPathArtifact;
import org.apache.maven.plugins.javadoc.options.OfflineLink;
import org.apache.maven.plugins.javadoc.options.ResourcesArtifact;
import org.apache.maven.plugins.javadoc.options.Tag;
import org.apache.maven.plugins.javadoc.options.Taglet;
import org.apache.maven.plugins.javadoc.options.TagletArtifact;
import org.codehaus.plexus.util.xml.pull.MXSerializer;
import org.codehaus.plexus.util.xml.pull.XmlSerializer;

/**
 * Class JavadocOptionsXpp3Writer.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class JavadocOptionsXpp3Writer
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field NAMESPACE.
     */
    private static final String NAMESPACE = null;

    /**
     * Field fileComment.
     */
    private String fileComment = null;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method setFileComment.
     * 
     * @param fileComment
     */
    public void setFileComment( String fileComment )
    {
        this.fileComment = fileComment;
    } //-- void setFileComment( String )

    /**
     * Method write.
     * 
     * @param writer
     * @param javadocOptions
     * @throws java.io.IOException
     */
    public void write( Writer writer, JavadocOptions javadocOptions )
        throws java.io.IOException
    {
        XmlSerializer serializer = new MXSerializer();
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  " );
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", "\n" );
        serializer.setOutput( writer );
        serializer.startDocument( javadocOptions.getModelEncoding(), null );
        writeJavadocOptions( javadocOptions, "javadocOptions", serializer );
        serializer.endDocument();
    } //-- void write( Writer, JavadocOptions )

    /**
     * Method write.
     * 
     * @param stream
     * @param javadocOptions
     * @throws java.io.IOException
     */
    public void write( OutputStream stream, JavadocOptions javadocOptions )
        throws java.io.IOException
    {
        XmlSerializer serializer = new MXSerializer();
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  " );
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", "\n" );
        serializer.setOutput( stream, javadocOptions.getModelEncoding() );
        serializer.startDocument( javadocOptions.getModelEncoding(), null );
        writeJavadocOptions( javadocOptions, "javadocOptions", serializer );
        serializer.endDocument();
    } //-- void write( OutputStream, JavadocOptions )

    /**
     * Method writeBootclasspathArtifact.
     * 
     * @param bootclasspathArtifact
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeBootclasspathArtifact( BootclasspathArtifact bootclasspathArtifact, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( bootclasspathArtifact.getGroupId() != null )
        {
            serializer.startTag( NAMESPACE, "groupId" ).text( bootclasspathArtifact.getGroupId() ).endTag( NAMESPACE, "groupId" );
        }
        if ( bootclasspathArtifact.getArtifactId() != null )
        {
            serializer.startTag( NAMESPACE, "artifactId" ).text( bootclasspathArtifact.getArtifactId() ).endTag( NAMESPACE, "artifactId" );
        }
        if ( bootclasspathArtifact.getVersion() != null )
        {
            serializer.startTag( NAMESPACE, "version" ).text( bootclasspathArtifact.getVersion() ).endTag( NAMESPACE, "version" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeBootclasspathArtifact( BootclasspathArtifact, String, XmlSerializer )

    /**
     * Method writeDocletArtifact.
     * 
     * @param docletArtifact
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeDocletArtifact( DocletArtifact docletArtifact, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( docletArtifact.getGroupId() != null )
        {
            serializer.startTag( NAMESPACE, "groupId" ).text( docletArtifact.getGroupId() ).endTag( NAMESPACE, "groupId" );
        }
        if ( docletArtifact.getArtifactId() != null )
        {
            serializer.startTag( NAMESPACE, "artifactId" ).text( docletArtifact.getArtifactId() ).endTag( NAMESPACE, "artifactId" );
        }
        if ( docletArtifact.getVersion() != null )
        {
            serializer.startTag( NAMESPACE, "version" ).text( docletArtifact.getVersion() ).endTag( NAMESPACE, "version" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeDocletArtifact( DocletArtifact, String, XmlSerializer )

    /**
     * Method writeGroup.
     * 
     * @param group
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeGroup( Group group, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( group.getTitle() != null )
        {
            serializer.startTag( NAMESPACE, "title" ).text( group.getTitle() ).endTag( NAMESPACE, "title" );
        }
        if ( group.getPackages() != null )
        {
            serializer.startTag( NAMESPACE, "packages" ).text( group.getPackages() ).endTag( NAMESPACE, "packages" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeGroup( Group, String, XmlSerializer )

    /**
     * Method writeJavadocOptions.
     * 
     * @param javadocOptions
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeJavadocOptions( JavadocOptions javadocOptions, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( ( javadocOptions.getGroups() != null ) && ( javadocOptions.getGroups().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "groups" );
            for ( Iterator iter = javadocOptions.getGroups().iterator(); iter.hasNext(); )
            {
                Group o = (Group) iter.next();
                writeGroup( o, "group", serializer );
            }
            serializer.endTag( NAMESPACE, "groups" );
        }
        if ( ( javadocOptions.getTags() != null ) && ( javadocOptions.getTags().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "tags" );
            for ( Iterator iter = javadocOptions.getTags().iterator(); iter.hasNext(); )
            {
                Tag o = (Tag) iter.next();
                writeTag( o, "tag", serializer );
            }
            serializer.endTag( NAMESPACE, "tags" );
        }
        if ( ( javadocOptions.getDocletArtifacts() != null ) && ( javadocOptions.getDocletArtifacts().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "docletArtifacts" );
            for ( Iterator iter = javadocOptions.getDocletArtifacts().iterator(); iter.hasNext(); )
            {
                DocletArtifact o = (DocletArtifact) iter.next();
                writeDocletArtifact( o, "docletArtifact", serializer );
            }
            serializer.endTag( NAMESPACE, "docletArtifacts" );
        }
        if ( ( javadocOptions.getTaglets() != null ) && ( javadocOptions.getTaglets().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "taglets" );
            for ( Iterator iter = javadocOptions.getTaglets().iterator(); iter.hasNext(); )
            {
                Taglet o = (Taglet) iter.next();
                writeTaglet( o, "taglet", serializer );
            }
            serializer.endTag( NAMESPACE, "taglets" );
        }
        if ( ( javadocOptions.getOfflineLinks() != null ) && ( javadocOptions.getOfflineLinks().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "offlineLinks" );
            for ( Iterator iter = javadocOptions.getOfflineLinks().iterator(); iter.hasNext(); )
            {
                OfflineLink o = (OfflineLink) iter.next();
                writeOfflineLink( o, "offlineLink", serializer );
            }
            serializer.endTag( NAMESPACE, "offlineLinks" );
        }
        if ( ( javadocOptions.getTagletArtifacts() != null ) && ( javadocOptions.getTagletArtifacts().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "tagletArtifacts" );
            for ( Iterator iter = javadocOptions.getTagletArtifacts().iterator(); iter.hasNext(); )
            {
                TagletArtifact o = (TagletArtifact) iter.next();
                writeTagletArtifact( o, "tagletArtifact", serializer );
            }
            serializer.endTag( NAMESPACE, "tagletArtifacts" );
        }
        if ( ( javadocOptions.getResourcesArtifacts() != null ) && ( javadocOptions.getResourcesArtifacts().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "resourcesArtifacts" );
            for ( Iterator iter = javadocOptions.getResourcesArtifacts().iterator(); iter.hasNext(); )
            {
                ResourcesArtifact o = (ResourcesArtifact) iter.next();
                writeResourcesArtifact( o, "resourcesArtifact", serializer );
            }
            serializer.endTag( NAMESPACE, "resourcesArtifacts" );
        }
        if ( ( javadocOptions.getBootclasspathArtifacts() != null ) && ( javadocOptions.getBootclasspathArtifacts().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "bootclasspathArtifacts" );
            for ( Iterator iter = javadocOptions.getBootclasspathArtifacts().iterator(); iter.hasNext(); )
            {
                BootclasspathArtifact o = (BootclasspathArtifact) iter.next();
                writeBootclasspathArtifact( o, "bootclasspathArtifact", serializer );
            }
            serializer.endTag( NAMESPACE, "bootclasspathArtifacts" );
        }
        if ( ( javadocOptions.getLinks() != null ) && ( javadocOptions.getLinks().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "links" );
            for ( Iterator iter = javadocOptions.getLinks().iterator(); iter.hasNext(); )
            {
                String link = (String) iter.next();
                serializer.startTag( NAMESPACE, "link" ).text( link ).endTag( NAMESPACE, "link" );
            }
            serializer.endTag( NAMESPACE, "links" );
        }
        if ( ( javadocOptions.getExcludePackageNames() != null ) && ( javadocOptions.getExcludePackageNames().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "excludePackageNames" );
            for ( Iterator iter = javadocOptions.getExcludePackageNames().iterator(); iter.hasNext(); )
            {
                String excludePackageName = (String) iter.next();
                serializer.startTag( NAMESPACE, "excludePackageName" ).text( excludePackageName ).endTag( NAMESPACE, "excludePackageName" );
            }
            serializer.endTag( NAMESPACE, "excludePackageNames" );
        }
        if ( javadocOptions.isDocfilesSubdirsUsed() != false )
        {
            serializer.startTag( NAMESPACE, "docfilesSubdirsUsed" ).text( String.valueOf( javadocOptions.isDocfilesSubdirsUsed() ) ).endTag( NAMESPACE, "docfilesSubdirsUsed" );
        }
        if ( javadocOptions.getExcludedDocfilesSubdirs() != null )
        {
            serializer.startTag( NAMESPACE, "excludedDocfilesSubdirs" ).text( javadocOptions.getExcludedDocfilesSubdirs() ).endTag( NAMESPACE, "excludedDocfilesSubdirs" );
        }
        if ( javadocOptions.getJavadocResourcesDirectory() != null )
        {
            serializer.startTag( NAMESPACE, "javadocResourcesDirectory" ).text( javadocOptions.getJavadocResourcesDirectory() ).endTag( NAMESPACE, "javadocResourcesDirectory" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeJavadocOptions( JavadocOptions, String, XmlSerializer )

    /**
     * Method writeJavadocPathArtifact.
     * 
     * @param javadocPathArtifact
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeJavadocPathArtifact( JavadocPathArtifact javadocPathArtifact, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( javadocPathArtifact.getGroupId() != null )
        {
            serializer.startTag( NAMESPACE, "groupId" ).text( javadocPathArtifact.getGroupId() ).endTag( NAMESPACE, "groupId" );
        }
        if ( javadocPathArtifact.getArtifactId() != null )
        {
            serializer.startTag( NAMESPACE, "artifactId" ).text( javadocPathArtifact.getArtifactId() ).endTag( NAMESPACE, "artifactId" );
        }
        if ( javadocPathArtifact.getVersion() != null )
        {
            serializer.startTag( NAMESPACE, "version" ).text( javadocPathArtifact.getVersion() ).endTag( NAMESPACE, "version" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeJavadocPathArtifact( JavadocPathArtifact, String, XmlSerializer )

    /**
     * Method writeOfflineLink.
     * 
     * @param offlineLink
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeOfflineLink( OfflineLink offlineLink, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( offlineLink.getUrl() != null )
        {
            serializer.startTag( NAMESPACE, "url" ).text( offlineLink.getUrl() ).endTag( NAMESPACE, "url" );
        }
        if ( offlineLink.getLocation() != null )
        {
            serializer.startTag( NAMESPACE, "location" ).text( offlineLink.getLocation() ).endTag( NAMESPACE, "location" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeOfflineLink( OfflineLink, String, XmlSerializer )

    /**
     * Method writeResourcesArtifact.
     * 
     * @param resourcesArtifact
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeResourcesArtifact( ResourcesArtifact resourcesArtifact, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( resourcesArtifact.getGroupId() != null )
        {
            serializer.startTag( NAMESPACE, "groupId" ).text( resourcesArtifact.getGroupId() ).endTag( NAMESPACE, "groupId" );
        }
        if ( resourcesArtifact.getArtifactId() != null )
        {
            serializer.startTag( NAMESPACE, "artifactId" ).text( resourcesArtifact.getArtifactId() ).endTag( NAMESPACE, "artifactId" );
        }
        if ( resourcesArtifact.getVersion() != null )
        {
            serializer.startTag( NAMESPACE, "version" ).text( resourcesArtifact.getVersion() ).endTag( NAMESPACE, "version" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeResourcesArtifact( ResourcesArtifact, String, XmlSerializer )

    /**
     * Method writeTag.
     * 
     * @param tag
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeTag( Tag tag, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( tag.getName() != null )
        {
            serializer.startTag( NAMESPACE, "name" ).text( tag.getName() ).endTag( NAMESPACE, "name" );
        }
        if ( tag.getHead() != null )
        {
            serializer.startTag( NAMESPACE, "head" ).text( tag.getHead() ).endTag( NAMESPACE, "head" );
        }
        if ( tag.getPlacement() != null )
        {
            serializer.startTag( NAMESPACE, "placement" ).text( tag.getPlacement() ).endTag( NAMESPACE, "placement" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeTag( Tag, String, XmlSerializer )

    /**
     * Method writeTaglet.
     * 
     * @param taglet
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeTaglet( Taglet taglet, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( taglet.getTagletClass() != null )
        {
            serializer.startTag( NAMESPACE, "tagletClass" ).text( taglet.getTagletClass() ).endTag( NAMESPACE, "tagletClass" );
        }
        if ( taglet.getTagletpath() != null )
        {
            serializer.startTag( NAMESPACE, "tagletpath" ).text( taglet.getTagletpath() ).endTag( NAMESPACE, "tagletpath" );
        }
        if ( taglet.getTagletArtifact() != null )
        {
            writeTagletArtifact( (TagletArtifact) taglet.getTagletArtifact(), "tagletArtifact", serializer );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeTaglet( Taglet, String, XmlSerializer )

    /**
     * Method writeTagletArtifact.
     * 
     * @param tagletArtifact
     * @param serializer
     * @param tagName
     * @throws java.io.IOException
     */
    private void writeTagletArtifact( TagletArtifact tagletArtifact, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( tagletArtifact.getGroupId() != null )
        {
            serializer.startTag( NAMESPACE, "groupId" ).text( tagletArtifact.getGroupId() ).endTag( NAMESPACE, "groupId" );
        }
        if ( tagletArtifact.getArtifactId() != null )
        {
            serializer.startTag( NAMESPACE, "artifactId" ).text( tagletArtifact.getArtifactId() ).endTag( NAMESPACE, "artifactId" );
        }
        if ( tagletArtifact.getVersion() != null )
        {
            serializer.startTag( NAMESPACE, "version" ).text( tagletArtifact.getVersion() ).endTag( NAMESPACE, "version" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeTagletArtifact( TagletArtifact, String, XmlSerializer )

}
