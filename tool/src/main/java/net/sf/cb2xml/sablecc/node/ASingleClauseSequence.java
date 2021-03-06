/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ASingleClauseSequence extends PClauseSequence
{
    private PClause _clause_;

    public ASingleClauseSequence ()
    {
    }

    public ASingleClauseSequence (PClause _clause_)
    {
        setClause (_clause_);
    }

    public Object clone ()
    {
        return new ASingleClauseSequence((PClause) cloneNode (_clause_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseASingleClauseSequence (this);
    }

    public PClause getClause ()
    {
        return _clause_;
    }

    public void setClause (PClause node)
    {
        if (_clause_ != null)
        {
            _clause_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _clause_ = node;
    }

    public String toString ()
    {
        return "" + toString (_clause_);
    }

    void removeChild (Node child)
    {
        if (_clause_ == child)
        {
            _clause_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_clause_ == oldChild)
        {
            setClause ((PClause) newChild);

            return;
        }
    }
}
