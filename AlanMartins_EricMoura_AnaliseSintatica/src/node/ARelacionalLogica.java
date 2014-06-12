/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ARelacionalLogica extends PLogica
{
    private PRelacional _relacional_;

    public ARelacionalLogica()
    {
        // Constructor
    }

    public ARelacionalLogica(
        @SuppressWarnings("hiding") PRelacional _relacional_)
    {
        // Constructor
        setRelacional(_relacional_);

    }

    @Override
    public Object clone()
    {
        return new ARelacionalLogica(
            cloneNode(this._relacional_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelacionalLogica(this);
    }

    public PRelacional getRelacional()
    {
        return this._relacional_;
    }

    public void setRelacional(PRelacional node)
    {
        if(this._relacional_ != null)
        {
            this._relacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relacional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._relacional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._relacional_ == child)
        {
            this._relacional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._relacional_ == oldChild)
        {
            setRelacional((PRelacional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
