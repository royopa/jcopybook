/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ANationalUsagePhrase extends PUsagePhrase
{
    private TNational _national_;

    public ANationalUsagePhrase ()
    {
    }

    public ANationalUsagePhrase (TNational _national_)
    {
        setNational (_national_);
    }

    public Object clone ()
    {
        return new ANationalUsagePhrase((TNational) cloneNode (_national_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseANationalUsagePhrase (this);
    }

    public TNational getNational ()
    {
        return _national_;
    }

    public void setNational (TNational node)
    {
        if (_national_ != null)
        {
            _national_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _national_ = node;
    }

    public String toString ()
    {
        return "" + toString (_national_);
    }

    void removeChild (Node child)
    {
        if (_national_ == child)
        {
            _national_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_national_ == oldChild)
        {
            setNational ((TNational) newChild);

            return;
        }
    }
}