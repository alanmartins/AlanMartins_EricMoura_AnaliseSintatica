/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMenosExpExp extends PExp
{
    private TMenos _menos_;
    private PExpArit _expArit_;

    public AMenosExpExp()
    {
        // Constructor
    }

    public AMenosExpExp(
        @SuppressWarnings("hiding") TMenos _menos_,
        @SuppressWarnings("hiding") PExpArit _expArit_)
    {
        // Constructor
        setMenos(_menos_);

        setExpArit(_expArit_);

    }

    @Override
    public Object clone()
    {
        return new AMenosExpExp(
            cloneNode(this._menos_),
            cloneNode(this._expArit_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenosExpExp(this);
    }

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
    }

    public PExpArit getExpArit()
    {
        return this._expArit_;
    }

    public void setExpArit(PExpArit node)
    {
        if(this._expArit_ != null)
        {
            this._expArit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expArit_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menos_)
            + toString(this._expArit_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menos_ == child)
        {
            this._menos_ = null;
            return;
        }

        if(this._expArit_ == child)
        {
            this._expArit_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
            return;
        }

        if(this._expArit_ == oldChild)
        {
            setExpArit((PExpArit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
