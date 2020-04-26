package at.roteskreuz.stopcorona.screens.base.epoxy

import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatImageView
import at.roteskreuz.stopcorona.R
import at.roteskreuz.stopcorona.skeleton.core.screens.base.view.BaseEpoxyHolder
import at.roteskreuz.stopcorona.skeleton.core.screens.base.view.BaseEpoxyModel
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass

/**
 * Model for handshake information teaser
 */
@EpoxyModelClass(layout = R.layout.base_additional_information_epoxy_model)
abstract class AdditionalInformationModel(private val onClick: () -> Unit) : BaseEpoxyModel<AdditionalInformationModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @DrawableRes
    @EpoxyAttribute
    var iconRes: Int = R.drawable.ic_info

    override fun Holder.onBind() {
        txtTitle.text = title
        imgIcon.setImageResource(iconRes)

        view.setOnClickListener { onClick() }
    }

    class Holder : BaseEpoxyHolder() {
        val txtTitle by bind<TextView>(R.id.txtInfo)
        val imgIcon by bind<AppCompatImageView>(R.id.imgIcon)
    }
}
