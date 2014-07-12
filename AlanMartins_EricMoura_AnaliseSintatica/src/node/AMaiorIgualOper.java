/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMaiorIgualOper extends POper
{
    private TMaiorIgual _maiorIgual_;

    public AMaiorIgualOper()
    {
        // Constructor
    }

    public AMaiorIgualOper(
        @SuppressWarnings("hiding") TMaiorIgual _maiorIgual_)
    {
        // Constructor
        setMaiorIgual(_maiorIgual_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorIgualOper(
            cloneNode(this._maiorIgual_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorIgualOper(this);
    }

    public TMaiorIgual getMaiorIgual()
    {
        return this._maiorIgual_;
    }

    public void setMaiorIgual(TMaiorIgual node)
    {
        if(this._maiorIgual_ != null)
        {
            this._maiorIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maiorIgual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._maiorIgual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._maiorIgual_ == child)
        {
            this._maiorIgual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._maiorIgual_ == oldChild)
        {
            setMaiorIgual((TMaiorIgual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
