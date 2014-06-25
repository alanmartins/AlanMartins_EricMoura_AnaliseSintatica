/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADivisaoTermo extends PTermo
{
    private PTermo _termo_;
    private TDiv _div_;
    private PUnario _unario_;

    public ADivisaoTermo()
    {
        // Constructor
    }

    public ADivisaoTermo(
        @SuppressWarnings("hiding") PTermo _termo_,
        @SuppressWarnings("hiding") TDiv _div_,
        @SuppressWarnings("hiding") PUnario _unario_)
    {
        // Constructor
        setTermo(_termo_);

        setDiv(_div_);

        setUnario(_unario_);

    }

    @Override
    public Object clone()
    {
        return new ADivisaoTermo(
            cloneNode(this._termo_),
            cloneNode(this._div_),
            cloneNode(this._unario_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivisaoTermo(this);
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    public TDiv getDiv()
    {
        return this._div_;
    }

    public void setDiv(TDiv node)
    {
        if(this._div_ != null)
        {
            this._div_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._div_ = node;
    }

    public PUnario getUnario()
    {
        return this._unario_;
    }

    public void setUnario(PUnario node)
    {
        if(this._unario_ != null)
        {
            this._unario_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unario_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo_)
            + toString(this._div_)
            + toString(this._unario_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        if(this._div_ == child)
        {
            this._div_ = null;
            return;
        }

        if(this._unario_ == child)
        {
            this._unario_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        if(this._div_ == oldChild)
        {
            setDiv((TDiv) newChild);
            return;
        }

        if(this._unario_ == oldChild)
        {
            setUnario((PUnario) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
