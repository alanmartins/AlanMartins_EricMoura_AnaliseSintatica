/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AItemXouItem extends PItem
{
    private PLogTermo _logTermo_;

    public AItemXouItem()
    {
        // Constructor
    }

    public AItemXouItem(
        @SuppressWarnings("hiding") PLogTermo _logTermo_)
    {
        // Constructor
        setLogTermo(_logTermo_);

    }

    @Override
    public Object clone()
    {
        return new AItemXouItem(
            cloneNode(this._logTermo_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAItemXouItem(this);
    }

    public PLogTermo getLogTermo()
    {
        return this._logTermo_;
    }

    public void setLogTermo(PLogTermo node)
    {
        if(this._logTermo_ != null)
        {
            this._logTermo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logTermo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logTermo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._logTermo_ == child)
        {
            this._logTermo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._logTermo_ == oldChild)
        {
            setLogTermo((PLogTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
