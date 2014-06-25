/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExpELogTermo extends PLogTermo
{
    private PLogTermo _logTermo_;
    private TE _e_;
    private PLogFator _logFator_;

    public AExpELogTermo()
    {
        // Constructor
    }

    public AExpELogTermo(
        @SuppressWarnings("hiding") PLogTermo _logTermo_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") PLogFator _logFator_)
    {
        // Constructor
        setLogTermo(_logTermo_);

        setE(_e_);

        setLogFator(_logFator_);

    }

    @Override
    public Object clone()
    {
        return new AExpELogTermo(
            cloneNode(this._logTermo_),
            cloneNode(this._e_),
            cloneNode(this._logFator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpELogTermo(this);
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

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public PLogFator getLogFator()
    {
        return this._logFator_;
    }

    public void setLogFator(PLogFator node)
    {
        if(this._logFator_ != null)
        {
            this._logFator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logFator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logTermo_)
            + toString(this._e_)
            + toString(this._logFator_);
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

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._logFator_ == child)
        {
            this._logFator_ = null;
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

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
            return;
        }

        if(this._logFator_ == oldChild)
        {
            setLogFator((PLogFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}