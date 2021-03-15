// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.plugins.javadoc.options;

/**
 * A Tag parameter.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Tag
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Name of the tag.
     */
    private String name;

    /**
     * Head of the tag.
     */
    private String head;

    /**
     * Placement of the tag.
     */
    private String placement;


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

        if ( !( other instanceof Tag ) )
        {
            return false;
        }

        Tag that = (Tag) other;
        boolean result = true;

        result = result && ( getName() == null ? that.getName() == null : getName().equals( that.getName() ) );
        result = result && ( getHead() == null ? that.getHead() == null : getHead().equals( that.getHead() ) );
        result = result && ( getPlacement() == null ? that.getPlacement() == null : getPlacement().equals( that.getPlacement() ) );

        return result;
    } //-- boolean equals( Object )

    /**
     * Get head of the tag.
     * 
     * @return String
     */
    public String getHead()
    {
        return this.head;
    } //-- String getHead()

    /**
     * Get name of the tag.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get placement of the tag.
     * 
     * @return String
     */
    public String getPlacement()
    {
        return this.placement;
    } //-- String getPlacement()

    /**
     * Method hashCode.
     * 
     * @return int
     */
    public int hashCode()
    {
        int result = 17;

        result = 37 * result + ( name != null ? name.hashCode() : 0 );
        result = 37 * result + ( head != null ? head.hashCode() : 0 );
        result = 37 * result + ( placement != null ? placement.hashCode() : 0 );

        return result;
    } //-- int hashCode()

    /**
     * Set head of the tag.
     * 
     * @param head
     */
    public void setHead( String head )
    {
        this.head = head;
    } //-- void setHead( String )

    /**
     * Set name of the tag.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Method toString.
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        StringBuilder buf = new StringBuilder( 128 );

        buf.append( "name = '" );
        buf.append( getName() );
        buf.append( "'" );
        buf.append( "\n" ); 
        buf.append( "head = '" );
        buf.append( getHead() );
        buf.append( "'" );
        buf.append( "\n" ); 
        buf.append( "placement = '" );
        buf.append( getPlacement() );
        buf.append( "'" );

        return buf.toString();
    } //-- java.lang.String toString()

    
    /**
     * Set a Placement. Should be a combinaison of the letters:
     * <ul>
     * <li> X (disable tag)</li>
     * <li> a (all)</li>
     * <li> o (overview)</li>
     * <li> p (packages)</li>
     * <li> t (types, that is classes and interfaces)</li>
     * <li> c (constructors)</li>
     * <li> m (methods)</li>
     * <li> f (fields)</li>
     * </ul>
     *
     * @param placement
     * @throws IllegalArgumentException  if not a valid combinaison of the letters
     */
    public void setPlacement(String placement)
      throws IllegalArgumentException
    {
        char[] chars = placement.toCharArray();
        for ( int i = 0; i < chars.length; i++ )
        {
            switch ( chars[i] )
            {
                case 'X':
                case 'a':
                case 'o':
                case 'p':
                case 't':
                case 'c':
                case 'm':
                case 'f':
                    break;
                default:
                    throw new IllegalArgumentException( "Placement should be a combination of the letters 'Xaoptcmf'." );
            }
        }
        this.placement = placement;
    }

          
}
