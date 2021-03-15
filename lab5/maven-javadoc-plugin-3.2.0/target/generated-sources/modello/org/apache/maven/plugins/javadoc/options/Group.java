// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.plugins.javadoc.options;

/**
 * A Group parameter.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Group
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Title can be any text, and can include white space. This
     * text is placed in the table heading for the group.
     */
    private String title;

    /**
     * Packages can be any package name, or can be the start of any
     * package name followed by an asterisk (*). The asterisk is a
     * wildcard meaning "match any characters". This is the only
     * wildcard allowed. Multiple patterns can be included in a
     * group by separating them with colons (:).
     */
    private String packages;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method equals.
     * 
     * @param other
     * @return boolean
     */
    public boolean equals( Object other )
    {
        if ( this == other )
        {
            return true;
        }

        if ( !( other instanceof Group ) )
        {
            return false;
        }

        Group that = (Group) other;
        boolean result = true;

        result = result && ( getTitle() == null ? that.getTitle() == null : getTitle().equals( that.getTitle() ) );
        result = result && ( getPackages() == null ? that.getPackages() == null : getPackages().equals( that.getPackages() ) );

        return result;
    } //-- boolean equals( Object )

    /**
     * Get packages can be any package name, or can be the start of
     * any package name followed by an asterisk (*). The asterisk
     * is a wildcard meaning "match any characters". This is the
     * only wildcard allowed. Multiple patterns can be included in
     * a group by separating them with colons (:).
     * 
     * @return String
     */
    public String getPackages()
    {
        return this.packages;
    } //-- String getPackages()

    /**
     * Get title can be any text, and can include white space. This
     * text is placed in the table heading for the group.
     * 
     * @return String
     */
    public String getTitle()
    {
        return this.title;
    } //-- String getTitle()

    /**
     * Method hashCode.
     * 
     * @return int
     */
    public int hashCode()
    {
        int result = 17;

        result = 37 * result + ( title != null ? title.hashCode() : 0 );
        result = 37 * result + ( packages != null ? packages.hashCode() : 0 );

        return result;
    } //-- int hashCode()

    /**
     * Set packages can be any package name, or can be the start of
     * any package name followed by an asterisk (*). The asterisk
     * is a wildcard meaning "match any characters". This is the
     * only wildcard allowed. Multiple patterns can be included in
     * a group by separating them with colons (:).
     * 
     * @param packages
     */
    public void setPackages( String packages )
    {
        this.packages = packages;
    } //-- void setPackages( String )

    /**
     * Set title can be any text, and can include white space. This
     * text is placed in the table heading for the group.
     * 
     * @param title
     */
    public void setTitle( String title )
    {
        this.title = title;
    } //-- void setTitle( String )

    /**
     * Method toString.
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        StringBuilder buf = new StringBuilder( 128 );

        buf.append( "title = '" );
        buf.append( getTitle() );
        buf.append( "'" );
        buf.append( "\n" ); 
        buf.append( "packages = '" );
        buf.append( getPackages() );
        buf.append( "'" );

        return buf.toString();
    } //-- java.lang.String toString()

}
