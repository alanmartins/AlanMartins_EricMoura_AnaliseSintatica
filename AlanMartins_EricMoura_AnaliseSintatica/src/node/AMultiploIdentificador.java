/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMultiploIdentificador extends PIdentificador
{
    private TId _id_;
    private TLColc _lColc_;
    private TNumInteiro _numInteiro_;
    private TRColc _rColc_;

    public AMultiploIdentificador()
    {
        // Constructor
    }

    public AMultiploIdentificador(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLColc _lColc_,
        @SuppressWarnings("hiding") TNumInteiro _numInteiro_,
        @SuppressWarnings("hiding") TRColc _rColc_)
    {
        // Constructor
        setId(_id_);

        setLColc(_lColc_);

        setNumInteiro(_numInteiro_);

        setRColc(_rColc_);

    }

    @Override
    public Object clone()
    {
        return new AMultiploIdentificador(
            cloneNode(this._id_),
            cloneNode(this._lColc_),
            cloneNode(this._numInteiro_),
            cloneNode(this._rColc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiploIdentificador(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TLColc getLColc()
    {
        return this._lColc_;
    }

    public void setLColc(TLColc node)
    {
        if(this._lColc_ != null)
        {
            this._lColc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lColc_ = node;
    }

    public TNumInteiro getNumInteiro()
    {
        return this._numInteiro_;
    }

    public void setNumInteiro(TNumInteiro node)
    {
        if(this._numInteiro_ != null)
        {
            this._numInteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numInteiro_ = node;
    }

    public TRColc getRColc()
    {
        return this._rColc_;
    }

    public void setRColc(TRColc node)
    {
        if(this._rColc_ != null)
        {
            this._rColc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rColc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._lColc_)
            + toString(this._numInteiro_)
            + toString(this._rColc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lColc_ == child)
        {
            this._lColc_ = null;
            return;
        }

        if(this._numInteiro_ == child)
        {
            this._numInteiro_ = null;
            return;
        }

        if(this._rColc_ == child)
        {
            this._rColc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lColc_ == oldChild)
        {
            setLColc((TLColc) newChild);
            return;
        }

        if(this._numInteiro_ == oldChild)
        {
            setNumInteiro((TNumInteiro) newChild);
            return;
        }

        if(this._rColc_ == oldChild)
        {
            setRColc((TRColc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
