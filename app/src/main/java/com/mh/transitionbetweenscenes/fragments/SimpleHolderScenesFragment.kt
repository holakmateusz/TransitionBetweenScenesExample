package com.mh.transitionbetweenscenes.fragments

import com.mh.transitionbetweenscenes.R
import com.mh.transitionbetweenscenes.databinding.AlternativeSceneLayoutBinding
import com.mh.transitionbetweenscenes.databinding.DefaultSceneLayoutBinding

class SimpleHolderScenesFragment :
    BaseHolderScenesFragment<DefaultSceneLayoutBinding, AlternativeSceneLayoutBinding>(
        R.layout.default_scene_layout,
        R.layout.alternative_scene_layout
    ) {

    private var title: String = ""
    private var textBtn: String = ""


    override fun initDefaultScene() {
        bindingForDefaultScene?.apply {
            textTitle.text = title
            triggerSceneChangesBtn.text = textBtn
            triggerSceneChangesBtn.setOnClickListener {
                triggerSceneChanges(true)
            }
        }
    }

    override fun initAlternativeScene() {
        bindingForAlternativeScene?.apply {
            textTitle.text = title
            triggerSceneChangesBtn.text = textBtn
            triggerSceneChangesBtn.setOnClickListener {
                triggerSceneChanges(false)
            }
        }
    }

    override fun initProperties() {
        title = getString(R.string.app_name)
        textBtn = getString(R.string.force_change_scene)
    }
}