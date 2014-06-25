/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ATemELogTermo extends PLogTermo
{
    private PLogFator _logFator_;

    public ATemELogTermo()
    {
        // Constructor
    }

    public ATemELogTermo(
        @SuppressWarnings("hiding") PLogFator _logFator_)
    {
        // Constructor
        setLogFator(_logFator_);

    }

    @Override
    public Object clone()
    {
        return new ATemELogTermo(
            cloneNode(this._logFator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATemELogTermo(this);
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
            + toString(this._logFator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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
        if(this._logFator_ == oldChild)
        {
            setLogFator((PLogFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}