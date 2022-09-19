package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.transition.*
import com.example.animation.databinding.ActivityTransitionBinding

class TransitionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTransitionBinding
    private lateinit var scene1: Scene
    private lateinit var scene2: Scene

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransitionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        scene1 = Scene.getSceneForLayout(binding.sceneRoot, R.layout.scene_1, this)
        scene2 = Scene.getSceneForLayout(binding.sceneRoot, R.layout.scene_2, this)

        binding.student.setOnClickListener {
            TransitionManager.go(scene1, ChangeBounds())
        }
        binding.worker.setOnClickListener {
            TransitionManager.go(scene2, Fade())
        }
    }

}