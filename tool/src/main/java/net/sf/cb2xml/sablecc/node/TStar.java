/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;


public final class TStar extends Token
{
    public TStar ()
    {
        super.setText ("*");
    }

    public TStar (int line, int pos)
    {
        super.setText ("*");
        setLine (line);
        setPos (pos);
    }

    public Object clone ()
    {
        return new TStar(getLine (), getPos ());
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseTStar (this);
    }

    public void setText (String text)
    {
        throw new RuntimeException("Cannot change TStar text.");
    }
}
