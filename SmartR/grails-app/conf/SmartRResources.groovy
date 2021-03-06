modules = {
    smartR_core {
        resource url: [plugin: 'smart-r', dir: 'css', file: 'smartR.css']
        resource url: [plugin: 'smart-r', dir: 'css', file: 'tooltip.css']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-2.1.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-ui-1.11.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'd3.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'd3-tip.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'box.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'crossfilter.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'plotly-latest.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jsrender.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'angular.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'angular-route.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'angular-css.js']
    }

    smartR_angular_components {
        dependsOn 'smartR_core'
        // app initializer
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular', file: 'smartRApp.js']
        // directives
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'conceptBox.js']
		resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'choiceConceptBoxMiGoe.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'tabContainer.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'workflowTab.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'fetchButton.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'preprocessButton.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'runButton.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'capturePlotButton.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'downloadResultsButton.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'ngTranscludeReplace.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'summaryStatistics.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'biomarkerSelection.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'sortingCriteria.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'cohortSummaryInfo.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'workflowWarnings.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'workflowControls.js']
        // services
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/services', file: 'rServeService.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/services', file: 'smartRUtils.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/services', file: 'commonWorkflowService.js']
    }

    smartR_all {
        dependsOn 'smartR_angular_components'
        // heatmap
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'heatmap.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Heatmap.js']
		// phenotypeHeatmap
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'phenotypeHeatmap.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3PhenotypeHeatmap.js']
		// methHeatmap - files not existing yet
        //resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'methheatmap.js']
        //resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Methheatmap.js']
        // correlation
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'correlation.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Correlation.js']
        // boxplot
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'boxplot.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'plotlyBoxplot.js']
        // volcano
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'volcanoplot.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Volcanoplot.js']
        // linegraph
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'linegraph.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Linegraph.js']
        // Alpha-Diversity
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'alphadiv.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Alphadiv.js']
        // Beta-Diversity
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'betadiversity.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3BetaDiversity.js']
        // Pedigree
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'pedigree.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Pedigree.js']
        // Dataquality
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'dataquality.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Dataquality.js']
    }
}
