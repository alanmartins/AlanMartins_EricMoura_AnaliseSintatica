/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AOperadores extends POperadores
{
    private POper _oper_;

    public AOperadores()
    {
        // Constructor
    }

    public AOperadores(
        @SuppressWarnings("hiding") POper _oper_)
    {
        // Constructor
        setOper(_oper_);

    }

    @Override
    public Object clone()
    {
        return new AOperadores(
            cloneNode(this._oper_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOperadores(this);
    }

    public POper getOper()
    {
        return this._oper_;
    }

    public void setOper(POper node)
    {
        if(this._oper_ != null)
        {
            this._oper_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._oper_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._oper_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._oper_ == child)
        {
            this._oper_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._oper_ == oldChild)
        {
            setOper((POper) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}