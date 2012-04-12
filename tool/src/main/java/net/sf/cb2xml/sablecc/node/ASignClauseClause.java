/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ASignClauseClause extends PClause
{
    private PSignClause _signClause_;

    public ASignClauseClause ()
    {
    }

    public ASignClauseClause (PSignClause _signClause_)
    {
        setSignClause (_signClause_);
    }

    public Object clone ()
    {
        return new ASignClauseClause((PSignClause) cloneNode (_signClause_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseASignClauseClause (this);
    }

    public PSignClause getSignClause ()
    {
        return _signClause_;
    }

    public void setSignClause (PSignClause node)
    {
        if (_signClause_ != null)
        {
            _signClause_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _signClause_ = node;
    }

    public String toString ()
    {
        return "" + toString (_signClause_);
    }

    void removeChild (Node child)
    {
        if (_signClause_ == child)
        {
            _signClause_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_signClause_ == oldChild)
        {
            setSignClause ((PSignClause) newChild);

            return;
        }
    }
}
